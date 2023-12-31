package ru.netology.nmedia.model

import ru.netology.nmedia.dto.Post

data class FeedModel(
    var posts: List<Post> = emptyList(),
    val loading: Boolean = false,
    val error: Boolean = false,
    val empty: Boolean = false,
    var refreshing: Boolean = false,
)
