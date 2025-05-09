package com.taobao.tao.topmultitab.service.location;

import android.content.Context;
import com.taobao.tao.topmultitab.service.base.IHomePageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface ILocationService extends IHomePageService {
    public static final String SERVICE_NAME = "LocationService";

    void updateLocationAtStartUp(Context context);
}
