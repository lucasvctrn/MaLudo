<template>
  <div class="max-w-sm rounded overflow-hidden shadow-lg m-4 border-4 border-gray-800 cursor-pointer duration-200 transform hover:scale-105">
    <NuxtLink :to="`game/${game.id}`">
      <img class="w-full" :src="game.imageUrl ? game.imageUrl : '/images/boardgame.png'" :alt="game.name">
      <div class="px-6 py-4">
        <div class="font-bold text-xl mb-2 text-center">{{ game.name ? game.name : "Undefined" }}</div>
      </div>
    </NuxtLink>
  </div>
</template>

<script>
export default {
  props: {
    game: {
      type: Object,
      required: true
    }
  }
}
</script>