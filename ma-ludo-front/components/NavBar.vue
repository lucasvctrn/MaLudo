<template>
  <nav class="h-36 flex items-center justify-between flex-wrap bg-gray-800 p-2">

    <NuxtLink to="/">
      <img class="h-32 w-auto" src="images/MaLudo.png" alt="Logo">
    </NuxtLink>

    <div class="lg:hidden">
      <button @click=showMenu() id="menuButton" class="flex items-center px-3 py-2">
        <svg class="h-8 w-8 fill-gray-50" viewBox="0 -960 960 960">
          <path d="M120-240v-60h720v60H120Zm0-210v-60h720v60H120Zm0-210v-60h720v60H120Z"/>
        </svg>
      </button>
    </div>

    <div :class="{'hidden': !showMenuItems}" class="w-full lg:w-auto lg:block">
      <div class="lg:flex space-x-6">
        <NuxtLink to="/games">
          <div class="group">
            <svg class="hidden lg:block h-8 w-8 m-auto fill-gray-200 group-hover:fill-white" viewBox="0 -960 960 960">
              <path d="M300.118-250Q321-250 335.5-264.618q14.5-14.617 14.5-35.5Q350-321 335.382-335.5q-14.617-14.5-35.5-14.5Q279-350 264.5-335.382q-14.5 14.617-14.5 35.5Q250-279 264.618-264.5q14.617 14.5 35.5 14.5Zm0-360Q321-610 335.5-624.618q14.5-14.617 14.5-35.5Q350-681 335.382-695.5q-14.617-14.5-35.5-14.5Q279-710 264.5-695.382q-14.5 14.617-14.5 35.5Q250-639 264.618-624.5q14.617 14.5 35.5 14.5Zm180 180Q501-430 515.5-444.618q14.5-14.617 14.5-35.5Q530-501 515.382-515.5q-14.617-14.5-35.5-14.5Q459-530 444.5-515.382q-14.5 14.617-14.5 35.5Q430-459 444.618-444.5q14.617 14.5 35.5 14.5Zm180 180Q681-250 695.5-264.618q14.5-14.617 14.5-35.5Q710-321 695.382-335.5q-14.617-14.5-35.5-14.5Q639-350 624.5-335.382q-14.5 14.617-14.5 35.5Q610-279 624.618-264.5q14.617 14.5 35.5 14.5Zm0-360Q681-610 695.5-624.618q14.5-14.617 14.5-35.5Q710-681 695.382-695.5q-14.617-14.5-35.5-14.5Q639-710 624.5-695.382q-14.5 14.617-14.5 35.5Q610-639 624.618-624.5q14.617 14.5 35.5 14.5ZM180-120q-24 0-42-18t-18-42v-600q0-24 18-42t42-18h600q24 0 42 18t18 42v600q0 24-18 42t-42 18H180Z"/>
            </svg>
            <label class="text-gray-200 group-hover:text-white">
              Mes jeux
            </label>
          </div>
        </NuxtLink>

        <NuxtLink v-if="user.isAuthenticated && user.hasAdminRole" to="/board/admin" class="text-gray-200 group-hover:text-white">
          <div class="group">
            <svg class="hidden lg:block h-8 w-8 m-auto fill-gray-200 group-hover:fill-white" viewBox="0 -960 960 960">
              <path d="M480.172-450Q537-450 577-490.172q40-40.171 40-97Q617-644 576.828-684q-40.171-40-97-40Q423-724 383-683.828q-40 40.171-40 97Q343-530 383.172-490q40.171 40 97 40ZM480-143q60-20 108-59.5t83-90.5q-44.668-21.022-92.972-32.011Q529.724-336 479.862-336 430-336 381.79-325.011 333.581-314.022 289-293q35 51 83 90.5T480-143Zm0 59q-5.32 0-9.88-1-4.56-1-9.12-3-139-47-220-168.5t-81-266.606V-719q0-19.257 10.875-34.662Q181.75-769.068 199-776l260-97q11-4 21-4t21 4l260 97q17.25 6.932 28.125 22.338Q800-738.257 800-719v195.894Q800-378 719-256.5T499-88q-4.56 2-9.12 3T480-84Z"/>
            </svg>
            <label class="text-gray-200 group-hover:text-white">
              Administration
            </label>
          </div>
        </NuxtLink>

        <NuxtLink v-if="!user.isAuthenticated" to="/auth/login" class="text-gray-200 group-hover:text-white">
          <div class="group">
            <svg class="hidden lg:block h-8 w-8 m-auto fill-gray-200 group-hover:fill-white" viewBox="0 -960 960 960">
              <path d="M480-481q-66 0-108-42t-42-108q0-66 42-108t108-42q66 0 108 42t42 108q0 66-42 108t-108 42ZM160-160v-94q0-38 19-65t49-41q67-30 128.5-45T480-420q62 0 123 15.5T731-360q31 14 50 41t19 65v94H160Z"/>
            </svg>
            <label class="text-gray-200 group-hover:text-white">
              Connexion
            </label>
          </div>
        </NuxtLink>

        <button v-if="user.isAuthenticated" v-on:click="logOut" class="text-gray-200 group-hover:text-white">
          <div class="group">
            <svg class="hidden lg:block h-8 w-8 m-auto fill-gray-200 group-hover:fill-white" viewBox="0 -960 960 960">
              <path d="M180-120q-24 0-42-18t-18-42v-600q0-24 18-42t42-18h299v60H180v600h299v60H180Zm486-185-43-43 102-102H360v-60h363L621-612l43-43 176 176-174 174Z"/>
            </svg>
            <label class="text-gray-200 group-hover:text-white">
              Déconnexion
            </label>
          </div>
        </button>
      </div>
    </div>
  </nav>
</template>

<script lang="ts">
import { useUserStore } from "~/store/userStore";

export default {
    data() {
        return {
            user: useUserStore(),
            showMenuItems: false
        };
    },
    methods: {
        showMenu() {
            this.showMenuItems = !this.showMenuItems;
        },
        logOut() {
          this.user.clearUser();
          localStorage.removeItem('jwtToken');
          localStorage.removeItem('role');
          return navigateTo('/');
        }
    }
}
</script>