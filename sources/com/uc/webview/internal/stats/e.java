package com.uc.webview.internal.stats;

import com.uc.webview.base.Log;
import com.uc.webview.internal.interfaces.ICoreStatsHandler;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e {
    public static void a(String str, Map<String, String> map) {
        f.b.contains(str);
        a(!f.f14512a.contains(str), f.c.contains(str), str, map);
    }

    public static void a(boolean z, boolean z2, String str, Map<String, String> map) {
        if (z || z2) {
            if (z2) {
                Log.b();
                i.a().a(str, map);
            }
            if (z) {
                ICoreStatsHandler iCoreStatsHandler = ICoreStatsHandler.Instance.get();
                if (iCoreStatsHandler != null) {
                    Log.b();
                    i.a();
                    i.b(map);
                    iCoreStatsHandler.stat(ICoreStatsHandler.CATEGORY, ICoreStatsHandler.EVENT_CATEGORY, str, map);
                    return;
                }
                Log.b();
            }
        }
    }
}
