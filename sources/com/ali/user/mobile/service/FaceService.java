package com.ali.user.mobile.service;

import com.ali.user.mobile.model.FaceVerifyCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface FaceService {
    void activeFaceLogin(String str, FaceVerifyCallback faceVerifyCallback);

    String getDeviceInfo();

    void nativeLogin(String str, FaceVerifyCallback faceVerifyCallback);
}
