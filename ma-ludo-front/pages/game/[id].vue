<template>
  <div class="h-screen flex items-center justify-center">
    <div class="flex items-center justify-center space-x-6">
      <img class="w-48 border-4 border-gray-800 rounded" :src="game.imageUrl ? game.imageUrl : '/images/boardgame.png'" :alt="game.name">
      <div class="ml-4">
        <h1 class="text-4xl text-gray-800 font-bold text-center mb-6 mt-6">{{ game.name }}</h1>
        <p class="text-center text-gray-800 mb-6">{{ game.description }}</p>
        <p class="text-center text-gray-800">Joueurs minimum : {{ game.minPlayers }}</p>
        <p class="text-center text-gray-800">Joueurs maximum : {{ game.maxPlayers }}</p>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
interface Game {
  id: string;
  name: string;
  description: string;
  minPlayers: number;
  maxPlayers: number;
  imageUrl: string;
}

// Get id from url
import { useRouter } from 'vue-router';
const router = useRouter();
const id = router.currentRoute.value.params.id;

const { data } = await useMyFetch('/api/board-games/' + id);
const game: Game = toRaw(data.value) as Game;
</script>