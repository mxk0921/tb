package com.alibaba.security.ccrc.interfaces;

import com.alibaba.security.wukong.model.meta.Data;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Uploader {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface UploadFinishListener {
        void onFail(String str);

        void onSuccess(String str);
    }

    void upload(Data data, UploadFinishListener uploadFinishListener);
}
