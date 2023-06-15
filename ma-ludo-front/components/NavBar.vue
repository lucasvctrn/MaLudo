<template>
  <nav class="flex items-center justify-between flex-wrap bg-gray-800 p-2">

    <nuxt-link to="/">
      <img class="h-32 w-auto" src="images/MaLudo.png" alt="Logo">
    </nuxt-link>

    <div class="lg:hidden">
      <button @click=showMenu() id="menuButton" class="flex items-center px-3 py-2">
        <svg class="h-8 w-8 fill-gray-50" viewBox="0 -960 960 960">
          <path d="M120-240v-60h720v60H120Zm0-210v-60h720v60H120Zm0-210v-60h720v60H120Z"/>
        </svg>
      </button>
    </div>

    <div :class="{'hidden': !showMenuItems}" class="w-full lg:w-auto lg:block">
      <div class="lg:flex space-x-6">
        <nuxt-link to="/games">
          <div class="group">
            <svg class="hidden lg:block h-8 w-8 m-auto fill-gray-200 group-hover:fill-white" viewBox="0 -960 960 960">
              <path d="M300.118-250Q321-250 335.5-264.618q14.5-14.617 14.5-35.5Q350-321 335.382-335.5q-14.617-14.5-35.5-14.5Q279-350 264.5-335.382q-14.5 14.617-14.5 35.5Q250-279 264.618-264.5q14.617 14.5 35.5 14.5Zm0-360Q321-610 335.5-624.618q14.5-14.617 14.5-35.5Q350-681 335.382-695.5q-14.617-14.5-35.5-14.5Q279-710 264.5-695.382q-14.5 14.617-14.5 35.5Q250-639 264.618-624.5q14.617 14.5 35.5 14.5Zm180 180Q501-430 515.5-444.618q14.5-14.617 14.5-35.5Q530-501 515.382-515.5q-14.617-14.5-35.5-14.5Q459-530 444.5-515.382q-14.5 14.617-14.5 35.5Q430-459 444.618-444.5q14.617 14.5 35.5 14.5Zm180 180Q681-250 695.5-264.618q14.5-14.617 14.5-35.5Q710-321 695.382-335.5q-14.617-14.5-35.5-14.5Q639-350 624.5-335.382q-14.5 14.617-14.5 35.5Q610-279 624.618-264.5q14.617 14.5 35.5 14.5Zm0-360Q681-610 695.5-624.618q14.5-14.617 14.5-35.5Q710-681 695.382-695.5q-14.617-14.5-35.5-14.5Q639-710 624.5-695.382q-14.5 14.617-14.5 35.5Q610-639 624.618-624.5q14.617 14.5 35.5 14.5ZM180-120q-24 0-42-18t-18-42v-600q0-24 18-42t42-18h600q24 0 42 18t18 42v600q0 24-18 42t-42 18H180Z"/>
            </svg>
            <label class="text-gray-200 group-hover:text-white">
              Mes jeux
            </label>
          </div>
        </nuxt-link>

        <nuxt-link to="/about">
          <div class="group">
            <svg class="hidden lg:block h-8 w-8 m-auto fill-gray-200 group-hover:fill-white" viewBox="0 -960 960 960">
              <path d="M453-280h60v-240h-60v240Zm26.982-314q14.018 0 23.518-9.2T513-626q0-14.45-9.482-24.225-9.483-9.775-23.5-9.775-14.018 0-23.518 9.775T447-626q0 13.6 9.482 22.8 9.483 9.2 23.5 9.2Zm.284 514q-82.734 0-155.5-31.5t-127.266-86q-54.5-54.5-86-127.341Q80-397.681 80-480.5q0-82.819 31.5-155.659Q143-709 197.5-763t127.341-85.5Q397.681-880 480.5-880q82.819 0 155.659 31.5Q709-817 763-763t85.5 127Q880-563 880-480.266q0 82.734-31.5 155.5T763-197.684q-54 54.316-127 86Q563-80 480.266-80Z"/>
            </svg>
            <label class="text-gray-200 group-hover:text-white">
              A propos
            </label>
          </div>
        </nuxt-link>

        <nuxt-link to="/login" class="text-gray-200 group-hover:text-white">
          <div class="group">
            <svg class="hidden lg:block h-8 w-8 m-auto fill-gray-200 group-hover:fill-white" viewBox="0 -960 960 960">
              <path d="M480-481q-66 0-108-42t-42-108q0-66 42-108t108-42q66 0 108 42t42 108q0 66-42 108t-108 42ZM160-160v-94q0-38 19-65t49-41q67-30 128.5-45T480-420q62 0 123 15.5T731-360q31 14 50 41t19 65v94H160Z"/>
            </svg>
            <label class="text-gray-200 group-hover:text-white">
              Connexion
            </label>
          </div>
        </nuxt-link>
      </div>
    </div>
  </nav>
</template>

<script lang="ts">
export default {
  data() {
    return {
      showMenuItems: false
    };
  },
  methods: {
    showMenu() {
      this.showMenuItems = !this.showMenuItems;
    }
  },
}
</script>