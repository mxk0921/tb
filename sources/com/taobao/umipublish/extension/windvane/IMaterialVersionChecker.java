package com.taobao.umipublish.extension.windvane;

import com.taobao.android.litecreator.service.ServiceImpl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.ypc;

/* compiled from: Taobao */
@ServiceImpl("com.taobao.umipublish.extension.windvane.MaterialVersionChecker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IMaterialVersionChecker extends ypc {
    public static final int TYPE_ALBUM_FILM = 1;
    public static final int TYPE_FUN = 0;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface MaterialType {
    }
}
