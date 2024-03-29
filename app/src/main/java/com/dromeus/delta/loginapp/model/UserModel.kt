package com.dromeus.delta.loginapp.model

import java.io.Serializable


class UserModel(val name: String, val userName: String, val profilePictureUrl: String, val socialNetwork: SocialNetwork) : Serializable

enum class SocialNetwork {
  Facebook, Twitter
}