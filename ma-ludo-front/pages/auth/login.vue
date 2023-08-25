<template>
  <div class="h-screen flex flex-col items-center justify-center">
    <div class="bg-white p-8 rounded-lg shadow-md w-full max-w-md">
      <h1 class="text-2xl font-semibold mb-4">Connexion administrateur</h1>
      <form @submit.prevent="login">
        <div class="mb-4">
          <label v-if="loginFailed" for="username" class="block font-medium mb-1 text-red-500">Echec de la connexion. Veillez réessayer.</label>
        </div>
        <div class="mb-4">
          <label for="username" class="block font-medium mb-1">Nom d'utilisateur</label>
          <input v-model="username" type="text" id="username" class="w-full px-3 py-2 border rounded-lg focus:ring focus:ring-blue-200" />
        </div>
        <div class="mb-4">
          <label for="password" class="block font-medium mb-1">Mot de passe</label>
          <input v-model="password" type="password" id="password" class="w-full px-3 py-2 border rounded-lg focus:ring focus:ring-blue-200" />
        </div>
        <button type="submit" class="w-full bg-blue-500 text-white py-2 rounded-lg hover:bg-blue-600">Se connecter</button>
      </form>
    </div>
  </div>
</template>

<script setup lang="ts">
import { useUserStore } from '~/store/userStore';

const userStore = useUserStore();
const username = ref('');
const password = ref('');
let loginFailed = ref(false);

const login = async () => {
  try {
    const { data, error } = await useMyFetch('/api/auth/signin', {
      method: 'POST',
      body: JSON.stringify({
        username: username.value,
        password: password.value
      })
    });

    if(error.value) {
      loginFailed.value = true;
    }
    else if(data.value) {
      const values = toRaw(data.value) as any;
      
      const token = values.accessToken;
      const pseudo = values.username;
      const roles = values.roles;

      userStore.setUser(pseudo, roles);
      localStorage.setItem('jwtToken', token);
      localStorage.setItem('role', userStore.hasAdminRole ? 'ROLE_ADMIN' : 'ROLE_USER');

      return navigateTo('/board/admin');
    }
  } catch (error) {
    console.error('Erreur de connexion :', error);
  }
};
</script>