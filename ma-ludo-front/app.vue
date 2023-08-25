<template>
  <div id="background" class="min-h-screen bg-games">
    <div id="app" class="flex flex-col min-h-screen bg-gray-50 bg-opacity-90">
      <NavBar />
      <NuxtPage />
    </div>
  </div>
</template>

<script setup lang="ts">
import { useUserStore } from '~/store/userStore';
import jwtDecode from 'jwt-decode';

useHead({
  title: 'MaLudo',
})

const userStore = useUserStore();

onMounted(() => {
  const jwtToken = localStorage.getItem('jwtToken');
  
  if (jwtToken) {
    const decodedToken = jwtDecode(jwtToken) as any;
    const currentTime = Math.floor(Date.now() / 1000);

    if (decodedToken.exp && decodedToken.exp < currentTime) {
      userStore.clearUser();
      localStorage.removeItem('jwtToken');
    } else {
      const pseudo = decodedToken.sub;
      const role = localStorage.getItem('role');
      userStore.setUser(pseudo, role);
    }
  }
});
</script>

<style>
.h-screen {
  max-height: calc(100vh - 9rem); /* 100vh - hauteur de la barre de navigation */
}
</style>