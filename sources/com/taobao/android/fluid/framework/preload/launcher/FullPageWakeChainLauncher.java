package com.taobao.android.fluid.framework.preload.launcher;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.DefaultFluidInitialize;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.c4o;
import tb.e0o;
import tb.g8w;
import tb.nwv;
import tb.qtm;
import tb.s0j;
import tb.sg7;
import tb.sz3;
import tb.t2o;
import tb.usm;
import tb.vrl;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FullPageWakeChainLauncher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String QUERY_VALUE_SKIP_MTOP = "skipMTOPV2";
    private static final String QUERY_VALUE_spm = "spm";
    private static final String ROLL_BACK = "huitui.huitui.0.0";
    private static final String SENCE_SOURCE = "sceneSource";
    private static final String TAG = "FullPageWake_PickPreloadController";
    private static boolean inited = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge(FullPageWakeChainLauncher.TAG, "loadLibrariesOnce");
            s0j.a(s0j.GG_VIDEOTAB_VIDEO_LOADSO);
            TaobaoMediaPlayer.loadLibrariesOnce(null);
            s0j.d(s0j.GG_VIDEOTAB_VIDEO_LOADSO);
        }
    }

    static {
        t2o.a(468714682);
    }

    public static void initTBVideoSDK(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0010ee4", new Object[]{context});
        } else if (context != null) {
            DefaultFluidInitialize.init(context);
        }
    }

    private static boolean isEnableLoadLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("392547f3", new Object[0])).booleanValue();
        }
        return e0o.b(o.J(), "load_video_so", false);
    }

    public static void init(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c2bc02", new Object[]{context, hashMap});
            return;
        }
        TLog.loge(TAG, "PickPreloadController,init task start " + JSON.toJSONString(hashMap));
        if (!inited) {
            inited = true;
            try {
                if (!sz3.b(hashMap)) {
                    String str = (String) hashMap.get("startIntent");
                    if (!TextUtils.isEmpty(str)) {
                        s0j.a(s0j.TRACE_VIDEOTAB_VIDEO_LAUNCHER_INIT);
                        qtm.p(System.currentTimeMillis());
                        Uri parse = Uri.parse(str);
                        if (parse != null && !"1".equals(parse.getQueryParameter(QUERY_VALUE_SKIP_MTOP))) {
                            TLog.loge(TAG, "MTOP优化开关打开");
                            if (isEnableLoadLibrary()) {
                                AsyncTask.execute(new a());
                            }
                            s0j.a(s0j.GG_VIDEOTAB_VIDEO_PRELOAD);
                            qtm.o(parse);
                            if (TextUtils.isEmpty(qtm.c(context, true))) {
                                Pair<String, String> j = vrl.j(parse);
                                if (j == null || (TextUtils.isEmpty((CharSequence) j.first) && TextUtils.isEmpty((CharSequence) j.second))) {
                                    tryPrefetchDetail(context, parse, hashMap);
                                    return;
                                }
                                TLog.logi(TAG, "PickPreloadController, requestVideoInfo, videoId:" + ((String) j.first) + " itemId:" + ((String) j.second));
                                s0j.a(s0j.GG_VIDEOTAB_VIDEO_PREFETCH_MTOP);
                                g8w.h((String) j.first, (String) j.second, true, null);
                                return;
                            }
                            tryPrefetchDetail(context, parse, hashMap);
                        }
                    }
                }
            } catch (Throwable th) {
                TLog.loge(TAG, "PickPreloadController,init task start,error: " + th.getMessage());
            }
        }
    }

    private static void tryPrefetchDetail(Context context, Uri uri, Map map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e5539c", new Object[]{context, uri, map});
        } else if (usm.i()) {
            TLog.loge(TAG, "fetchContentDetail tryPrefetchDetail  targetUri=" + uri + " ； params=" + map);
            JSONObject g = vrl.g(uri);
            int t = nwv.t(map.get("prefetchTimeOut"), 10000);
            if (uri != null) {
                hashMap = new HashMap(1);
                hashMap.put(c4o.KEY_TAB3COMPONENTSOURCE, uri.getQueryParameter("source"));
            } else {
                hashMap = null;
            }
            g8w.g(g, sg7.FAKE_CONTENT_ID, true, true, t, hashMap, false, null, null);
        }
    }
}
