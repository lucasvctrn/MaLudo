<template>
  <div class="h-auto">
    <h1 class="text-4xl text-gray-800 font-bold text-center mb-6 mt-6">Administration</h1>
  </div>
</template>

<script setup lang="ts">
  definePageMeta({
    middleware: 'auth-admin'
  })
</script>