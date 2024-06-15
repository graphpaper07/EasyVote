<template>
  <nav>
    <ul>
      <li><router-link to="/">Home</router-link></li>
      <li><router-link to="/vote-post">Vote Post</router-link></li>
    </ul>
  </nav>
</template>

<script>
export default {
  name: 'NavBar'
};
</script>

<style scoped>
nav {
  background-color: #E3E3E3;
  color: white;
  padding: 1rem;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline;
  margin-right: 1rem;
}

router-link {
  color: white;
  text-decoration: none;
}

router-link:hover {
  text-decoration: underline;
}
</style>
