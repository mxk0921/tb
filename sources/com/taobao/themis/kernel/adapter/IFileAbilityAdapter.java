package com.taobao.themis.kernel.adapter;

import tb.n8s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IFileAbilityAdapter extends n8s {
    String getUserId();

    boolean hasFolderPermission(String str);

    String queryLocalIdByPath(String str);

    String queryPathByLocalId(String str);

    boolean saveIdWithPath(String str, String str2);
}
