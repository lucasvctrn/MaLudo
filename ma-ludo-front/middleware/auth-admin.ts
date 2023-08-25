import { useUserStore } from "~/store/userStore";

export default defineNuxtRouteMiddleware((to, from) => {
  const userStore = useUserStore();

  // Vérifie si l'utilisateur est authentifié
  if (!userStore.isAuthenticated) {
    return navigateTo('/auth/login'); // Redirige vers la page de connexion si non authentifié
  }

  // Vérifie si l'utilisateur a le rôle d'administrateur
  if (!userStore.hasAdminRole) {
    return navigateTo('/'); // Redirige vers la page d'accueil si non administrateur
  }
});