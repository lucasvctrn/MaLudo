import { defineStore } from 'pinia';

export const useUserStore = defineStore({
  id: 'user',
  state: () => ({
    username: '',
    roles: [],
  }),
  actions: {
    setUser(username, roles) {
      this.username = username;
      this.roles = roles;
    },
    clearUser() {
      this.username = '';
      this.roles = [];
    }
  },
  getters: {
    isAuthenticated: (state) => !!state.username,
    hasAdminRole: (state) => state.roles.includes('ROLE_ADMIN'),
  },
});