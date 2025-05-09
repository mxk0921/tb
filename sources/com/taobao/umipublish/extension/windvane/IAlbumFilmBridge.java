package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.litecreator.service.ServiceImpl;
import tb.vdv;
import tb.x6c;

/* compiled from: Taobao */
@ServiceImpl("com.taobao.android.litecreator.service.impl.AlbumFilmBridge")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IAlbumFilmBridge extends x6c {
    boolean downloadTemplateRes(Context context, JSONObject jSONObject, vdv<JSONObject> vdvVar, vdv<JSONObject> vdvVar2);

    boolean openInner(Context context, WVCallBackContext wVCallBackContext);
}
