<template>
  <div class="h-auto">
    <h1 class="text-4xl text-gray-800 font-bold text-center mb-6 mt-6">Mes jeux</h1>
    <div class="grid grid-cols-3 gap-4">
      <GameCard v-for="game in games" :game="game" :key="game.id" />
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
}

const { data } = await useMyFetch('/api/board-games');
const games: Game[] = toRaw(data.value) as Game[];
</script>