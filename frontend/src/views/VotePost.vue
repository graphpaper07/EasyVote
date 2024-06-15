<template>
  <div class="vote-board">
    <h1>투표 게시판</h1>
    <div class="table-container">
      <table>
        <thead>
        <tr>
          <th class="seq-column">No</th>
          <th class="nm-column">투표명</th>
          <th class="stt-column">시작일자</th>
          <th class="end-column">종료일자</th>
          <th class="prg-column">진행상황</th>
          <th class="pn-column">작성자</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="post in posts" :key="post.rgSeq">
          <td>{{ post.rgSeq }}</td>
          <td>{{ post.vtNm }}</td>
          <td>{{ post.sttDtti }}</td>
          <td>{{ post.endDtti }}</td>
          <td>{{ post.vtPrgDc }}</td>
          <td>{{ post.pn }}</td>
        </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import axios from '../api/axios';

export default {
  name: 'VotePost',
  data() {
    return {
      posts: []
    };
  },
  methods: {
    async fetchPosts() {
      try {
        const response = await axios.get('/voteList');
        this.posts = response.data;
      } catch (error) {
        console.error('Failed to fetch posts:', error);
      }
    }
  },
  mounted() {
    this.fetchPosts();
  }
};
</script>

<style scoped>
.vote-board {
  padding: 20px;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.table-container {
  width: 90%; /* 테이블 너비를 조절합니다. */
  overflow-x: auto;
}

table {
  width: 100%;
  border-collapse: collapse;
}

th, td {
  border: 1px solid #ddd;
  padding: 8px;
  text-align: center; /* 테이블의 모든 셀을 가운데 정렬합니다. */
}

th {
  background-color: #f4f4f4;
}

tr:nth-child(even) {
  background-color: #f9f9f9;
}

tr:hover {
  background-color: #f1f1f1;
}

/* 각 열의 너비 조절 */
.seq-column {
  width: 5%;
}

.nm-column {
  width: 35%;
}

.stt-column {
  width: 15%;
}

.end-column {
  width: 15%;
}
.prg-column {
  width: 15%;
}

.pn-column {
  width: 15%;
}
</style>
