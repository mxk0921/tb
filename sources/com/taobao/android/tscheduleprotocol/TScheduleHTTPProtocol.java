package com.taobao.android.tscheduleprotocol;

import android.content.Context;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface TScheduleHTTPProtocol extends ScheduleProtocol {
    Map<String, String> getHeaders(Context context, String str, String str2);
}
