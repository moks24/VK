package ru.nethology.domain;

public class Post {
    private int id;
    private int owner_id;
    private int from_id;
    private int created_by;
    private int date;
    private String text;
    private int reply_owner_id;
    private int reply_post_id;
    private int friends_only;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private Likes likes;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerID;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean ifFavorite;
    private Donat donat;
    private int postponedId;

}
