package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.C1180n;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static f7b f26826a;
    public static final Object b = new Object();
    public static final feh c = new feh(qmm.class.getSimpleName(), "Global");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements jsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jsc
        public void onPick(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc46917", new Object[]{this, new Boolean(z), str});
            }
        }
    }

    static {
        t2o.a(774897868);
    }

    public static void a(Context context, String str) {
        t7b d;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25dc16f1", new Object[]{context, str});
        } else if (context != null && !TextUtils.isEmpty(str) && (d = a7m.d(context)) != null) {
            boolean startsWith = str.startsWith("http");
            if (startsWith) {
                str2 = rmm.e().d(str);
            } else {
                str2 = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                d.P(str2);
            }
            if (startsWith) {
                rmm.e().l(str);
            } else {
                rmm.e().k(str);
            }
        }
    }

    public static f7b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f7b) ipChange.ipc$dispatch("24746c21", new Object[0]);
        }
        f7b f7bVar = f26826a;
        if (f7bVar != null) {
            return f7bVar;
        }
        f7b f7bVar2 = new f7b();
        f26826a = f7bVar2;
        return f7bVar2;
    }

    public static boolean d(Context context, JSONObject jSONObject) {
        Map<String, String> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c42e5294", new Object[]{context, jSONObject})).booleanValue();
        }
        if (!(context == null || jSONObject == null || (g = new ca5(jSONObject, "").g()) == null)) {
            for (Map.Entry<String, String> entry : g.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (ja1.w(context, key, value) > 0) {
                    feh fehVar = c;
                    AVSDKLog.e(fehVar, "isHitCacheWithMediaInfo: cacheKey=" + key + ",url=" + value + " is hitCache.");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(Context context, JSONObject jSONObject) {
        Map<String, String> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("281ae08e", new Object[]{context, jSONObject})).booleanValue();
        }
        if (!(context == null || jSONObject == null || (g = new ca5(jSONObject, "").g()) == null)) {
            for (Map.Entry<String, String> entry : g.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (ja1.x(context, key, value) > 0) {
                    feh fehVar = c;
                    AVSDKLog.e(fehVar, "isHitCacheWithMediaInfoNew: cacheKey=" + key + ",url=" + value + " is hitCache.");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(Context context, JSONObject jSONObject, int i, MediaPlayControlContext mediaPlayControlContext) {
        Map<String, ba5> q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94d68d40", new Object[]{context, jSONObject, new Integer(i), mediaPlayControlContext})).booleanValue();
        }
        if (!(context == null || jSONObject == null || i < -1)) {
            ca5 ca5Var = new ca5(jSONObject, mediaPlayControlContext.mPlayToken);
            mediaPlayControlContext.mVideoId = ca5Var.r();
            feh fehVar = c;
            AVSDKLog.e(fehVar, "HDR start PreDownload preLoadMediaInfo videoID " + ca5Var.r() + " video_definition->bitrate " + ca5Var.p());
            if (!(TextUtils.isEmpty(mediaPlayControlContext.mVideoId) || (q = ca5Var.q()) == null || q.size() == 0)) {
                return true;
            }
        }
        return false;
    }

    public static MediaPlayControlContext g(Context context, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayControlContext) ipChange.ipc$dispatch("8b252bb5", new Object[]{context, jSONObject, new Integer(i)});
        }
        MediaPlayControlContext mediaPlayControlContext = new MediaPlayControlContext(context, "");
        mediaPlayControlContext.mIsForPreDownload = true;
        if (!f(context, jSONObject, i, mediaPlayControlContext)) {
            return null;
        }
        mediaPlayControlContext.setH265(TaobaoMediaPlayer.isDecoderLoaded());
        mediaPlayControlContext.mConfigGroup = "DWInteractive";
        mediaPlayControlContext.setPlayerType(3);
        mediaPlayControlContext.setMediaInfoParams(jSONObject);
        mediaPlayControlContext.mVideoSource = "TBVideo";
        mediaPlayControlContext.setEnableMediaInfoLength(true);
        try {
            new com.taobao.mediaplay.a(mediaPlayControlContext).L(new a());
            return mediaPlayControlContext;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String h(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dbb7c3a", new Object[]{context, jSONObject});
        }
        return i(context, jSONObject, null, null);
    }

    public static String j(Context context, JSONObject jSONObject, int i, wbd wbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec50760b", new Object[]{context, jSONObject, new Integer(i), wbdVar});
        }
        return l(context, jSONObject, i, wbdVar, null, false);
    }

    public static String k(Context context, JSONObject jSONObject, int i, wbd wbdVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dfb1802", new Object[]{context, jSONObject, new Integer(i), wbdVar, hashMap});
        }
        return l(context, jSONObject, i, wbdVar, hashMap, false);
    }

    public static String l(Context context, JSONObject jSONObject, int i, wbd wbdVar, HashMap<String, String> hashMap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7667768", new Object[]{context, jSONObject, new Integer(i), wbdVar, hashMap, new Boolean(z)});
        }
        MediaPlayControlContext g = g(context, jSONObject, i);
        if (g == null) {
            return null;
        }
        String videoUrl = g.getVideoUrl();
        String str = g.mVideoId;
        if (!TextUtils.isEmpty(videoUrl) && !TextUtils.isEmpty(str)) {
            String cacheKey = g.getCacheKey();
            if (z && !cacheKey.isEmpty() && !cacheKey.startsWith("0_")) {
                cacheKey = "0_".concat(cacheKey);
                feh fehVar = c;
                AVSDKLog.e(fehVar, "PreDownloadManager add high priority prefix, cacheKey=" + cacheKey);
            }
            int videoLength = g.getVideoLength();
            int n = n(i, g.getPlayableBytes(), videoLength);
            if (videoUrl.startsWith(itw.URL_SEPARATOR)) {
                videoUrl = "http:".concat(videoUrl);
            }
            StringBuilder sb = new StringBuilder(256);
            if (cacheKey != null && !TextUtils.isEmpty(cacheKey)) {
                sb.append("videoCacheId=".concat(cacheKey));
            }
            if (!TextUtils.isEmpty(a7m.b(context, ew0.b(videoUrl, sb)))) {
                try {
                    wbdVar.onStart(videoUrl);
                    wbdVar.onFinish(n);
                } catch (Throwable unused) {
                }
                return videoUrl;
            }
            t7b d = a7m.d(context);
            if (d != null && d.D()) {
                sb.append("&");
                sb.append("preLoad=true");
                sb.append("&");
                sb.append("videoId=" + str);
                if (videoLength > 0) {
                    sb.append("&");
                    sb.append("videoLength=" + videoLength);
                }
                if (hashMap != null) {
                    String str2 = hashMap.get("from");
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append("&");
                        sb.append("bizCode=" + str2);
                    }
                    String str3 = hashMap.get(a7m.VIDEO_PLAY_SCENES);
                    if (!TextUtils.isEmpty(str3)) {
                        sb.append("&");
                        sb.append("videoPlayScenes=" + str3);
                    }
                }
                String b2 = ew0.b(videoUrl, sb);
                c().b(d.v(b2), ew0.l(context), n);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url", videoUrl);
                hashMap2.put(VideoControllerManager.KEY_BITRATE, "" + g.getCurrentBitRate());
                hashMap2.put(pg1.ATOM_length, "" + videoLength);
                hashMap2.put(VideoControllerManager.KEY_CACHEKEY, cacheKey);
                hashMap2.put("videoDefinition", g.getVideoDefinition());
                if (!TextUtils.isEmpty(g.getVideoDefinition())) {
                    hashMap2.put("videoIsHDR", String.valueOf(g.getVideoDefinition().contains("hdr")));
                }
                feh fehVar2 = c;
                AVSDKLog.e(fehVar2, "HDR End PreDownloaded Video videoID " + str + " videoDefinition " + g.getVideoDefinition() + " bitrate " + g.getCurrentBitRate() + " from bitRateMaps" + g.mBitRateMapStr);
                hashMap2.put("bitRateMap", g.mBitRateMapStr);
                hashMap2.put("selectReason", String.valueOf(g.mSelectReasonForPreDownload));
                hashMap2.put("calNetSpeed", String.valueOf(g.mNetSpeedForPreDownload));
                hashMap2.put("calNetSpeedByRobust", String.valueOf(g.mNetSpeedByRobustAtPreDL));
                hashMap2.put("calNetSpeedReason", String.valueOf(g.mNetSpeedCalReasonForPreDL));
                hashMap2.put("useRecDataTime", String.valueOf(g.mUseRecDataTime ? 1 : 0));
                hashMap2.put("defDegradeReason", String.valueOf(g.mDefDegradeReason));
                hashMap2.put("ud265BitRate", String.valueOf(g.mUD265BitRate));
                hashMap2.put("hd265BitRate", String.valueOf(g.mHD265BitRate));
                hashMap2.put("ud266BitRate", String.valueOf(g.mUD266BitRate));
                hashMap2.put("hd266BitRate", String.valueOf(g.mHD266BitRate));
                hashMap2.put("hd264BitRate", String.valueOf(g.mHD264BitRate));
                hashMap2.put("hasChooseS266", String.valueOf(g.mHasChooseS266));
                pmm.b().d(str, hashMap2);
                rmm.e().c(cacheKey, videoUrl, wbdVar);
                if (wbdVar != null) {
                    try {
                        wbdVar.onStart(videoUrl);
                    } catch (Throwable unused2) {
                    }
                }
                feh fehVar3 = c;
                AVSDKLog.e(fehVar3, "preLoadWithVideoInfoInner final pickUrl=" + videoUrl);
                return b2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r7 > r8) goto L_0x0070;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m(android.content.Context r5, java.lang.String r6, int r7, int r7, tb.wbd r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.qmm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x002b
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r2 = 0
            r8[r2] = r5
            r5 = 1
            r8[r5] = r6
            r5 = 2
            r8[r5] = r1
            r5 = 3
            r8[r5] = r7
            r5 = 4
            r8[r5] = r9
            java.lang.String r5 = "75f8dee7"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r8)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x002b:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0033
            return r1
        L_0x0033:
            java.lang.String r0 = tb.e2n.e(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 64
            r2.<init>(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0056
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "videoCacheId="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
        L_0x0056:
            java.lang.String r3 = tb.ew0.b(r6, r2)
            java.lang.String r3 = tb.a7m.b(r5, r3)
            if (r7 <= 0) goto L_0x0065
            if (r8 <= 0) goto L_0x0075
            if (r7 <= r8) goto L_0x0075
            goto L_0x0070
        L_0x0065:
            r4 = 102400(0x19000, float:1.43493E-40)
            if (r7 >= 0) goto L_0x0072
            if (r8 <= 0) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            r8 = 102400(0x19000, float:1.43493E-40)
        L_0x0070:
            r7 = r8
            goto L_0x0075
        L_0x0072:
            r7 = 102400(0x19000, float:1.43493E-40)
        L_0x0075:
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 != 0) goto L_0x0082
            r9.onStart(r6)     // Catch: all -> 0x0081
            r9.onFinish(r7)     // Catch: all -> 0x0081
        L_0x0081:
            return r6
        L_0x0082:
            tb.t7b r8 = tb.a7m.d(r5)
            boolean r3 = r8.D()
            if (r3 != 0) goto L_0x008d
            return r1
        L_0x008d:
            java.lang.String r1 = "&"
            r2.append(r1)
            java.lang.String r1 = "preLoad=true"
            r2.append(r1)
            java.lang.String r1 = tb.ew0.b(r6, r2)
            java.lang.String r5 = tb.ew0.l(r5)
            java.lang.String r8 = r8.v(r1)
            tb.f7b r1 = c()
            r1.b(r8, r5, r7)
            tb.rmm r5 = tb.rmm.e()
            r5.c(r0, r6, r9)
            if (r9 == 0) goto L_0x00b7
            r9.onStart(r6)     // Catch: all -> 0x00b7
        L_0x00b7:
            tb.feh r5 = tb.qmm.c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "preLoadWithVideourl url="
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r5, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qmm.m(android.content.Context, java.lang.String, int, int, tb.wbd):java.lang.String");
    }

    public static int n(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ee039e1", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i == -1 || i > i3) {
            return i3;
        }
        if (i == 0 && i2 > 262144) {
            return i2;
        }
        if (i < 102400) {
            return C1180n.b;
        }
        return i;
    }

    public static boolean o(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2efca86f", new Object[]{context, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            AVSDKLog.e(c, "PreDownloadManager upgradeCachePriority failed with empty cacheKey.");
            return false;
        } else if (str2.startsWith("0_")) {
            feh fehVar = c;
            AVSDKLog.e(fehVar, "PreDownloadManager the cacheKey=" + str2 + " is already upgraded, no need to upgrade again.");
            return false;
        } else {
            synchronized (b) {
                try {
                    String absolutePath = StorageUtils.getIndividualCacheDirectory(context).getAbsolutePath();
                    String concat = "0_".concat(str2);
                    File file = new File(absolutePath, str2.concat(wb9.TEMP_POSTFIX));
                    feh fehVar2 = c;
                    AVSDKLog.e(fehVar2, "PredownloadManager upgradeCachePriority:download file.exists()=" + file.exists() + ", file.canRead()=" + file.canRead());
                    if (!file.exists() || !file.canRead()) {
                        File file2 = new File(absolutePath, str2);
                        AVSDKLog.e(fehVar2, "PredownloadManager upgradeCachePriority:complete file.exists()=" + file2.exists() + ", file.canRead()=" + file2.canRead());
                        if (!file2.exists() || !file2.canRead()) {
                            return false;
                        }
                        boolean renameTo = file2.renameTo(new File(absolutePath, concat));
                        if (renameTo) {
                            Map<String, String> a2 = pmm.b().a(str);
                            if (a2 == null) {
                                a2 = new HashMap<>();
                            }
                            a2.put(VideoControllerManager.KEY_CACHEKEY, concat);
                            pmm.b().d(str, a2);
                        }
                        return renameTo;
                    }
                    boolean renameTo2 = file.renameTo(new File(absolutePath, concat + wb9.TEMP_POSTFIX));
                    if (renameTo2) {
                        Map<String, String> a3 = pmm.b().a(str);
                        if (a3 == null) {
                            a3 = new HashMap<>();
                        }
                        a3.put(VideoControllerManager.KEY_CACHEKEY, concat);
                        pmm.b().d(str, a3);
                    }
                    return renameTo2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c856708", new Object[]{context, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            AVSDKLog.e(c, "PreDownloadManager downgradeCachePriority failed with empty cacheKey.");
            return false;
        }
        synchronized (b) {
            try {
                if (!str2.startsWith("0_")) {
                    feh fehVar = c;
                    AVSDKLog.e(fehVar, "PreDownloadManager the cacheKey=" + str2 + " is not high priority, try to degrade.");
                    str2 = "0_".concat(str2);
                }
                String absolutePath = StorageUtils.getIndividualCacheDirectory(context).getAbsolutePath();
                String replaceFirst = str2.replaceFirst("0_", "");
                feh fehVar2 = c;
                AVSDKLog.e(fehVar2, "PreDownloadManager try to downgradeCachePriority the cacheKey=".concat(str2));
                boolean s = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableDelFileWhichNoData", "true"));
                File file = new File(absolutePath, str2.concat(wb9.TEMP_POSTFIX));
                AVSDKLog.e(fehVar2, "PredownloadManager downgradeCachePriority:download file.exists()=" + file.exists() + ", file.canRead()=" + file.canRead());
                if (!file.exists() || !file.canRead()) {
                    File file2 = new File(absolutePath, str2);
                    AVSDKLog.e(fehVar2, "PredownloadManager downgradeCachePriority:complete file.exists()=" + file2.exists() + ", file.canRead()=" + file2.canRead());
                    if (!file2.exists() || !file2.canRead()) {
                        return false;
                    }
                    boolean renameTo = file2.renameTo(new File(absolutePath, replaceFirst));
                    if (renameTo) {
                        Map<String, String> a2 = pmm.b().a(str);
                        if (a2 == null) {
                            a2 = new HashMap<>();
                        }
                        a2.put(VideoControllerManager.KEY_CACHEKEY, replaceFirst);
                        pmm.b().d(str, a2);
                    }
                    if (s) {
                        File file3 = new File(absolutePath, str2);
                        if (file3.exists()) {
                            AVSDKLog.e(fehVar2, "PreDownloadManager del high priority cache when downgradeCachePriority");
                            file3.delete();
                        }
                    }
                    return renameTo;
                }
                boolean renameTo2 = file.renameTo(new File(absolutePath, replaceFirst + wb9.TEMP_POSTFIX));
                if (renameTo2) {
                    Map<String, String> a3 = pmm.b().a(str);
                    if (a3 == null) {
                        a3 = new HashMap<>();
                    }
                    a3.put(VideoControllerManager.KEY_CACHEKEY, replaceFirst);
                    pmm.b().d(str, a3);
                }
                if (s) {
                    File file4 = new File(absolutePath, str2.concat(wb9.TEMP_POSTFIX));
                    if (file4.exists()) {
                        AVSDKLog.e(fehVar2, "PreDownloadManager del high priority cache when downgradeCachePriority");
                        file4.delete();
                    }
                }
                return renameTo2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String i(Context context, JSONObject jSONObject, wbd wbdVar, HashMap<String, String> hashMap) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b3f6bc4", new Object[]{context, jSONObject, wbdVar, hashMap});
        }
        if (!(context == null || jSONObject == null)) {
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Object opt = jSONObject.opt("bytes");
            int parseInt = (opt == null || !TextUtils.isDigitsOnly(opt.toString())) ? 0 : Integer.parseInt(opt.toString());
            Object opt2 = jSONObject.opt("videoInfoList");
            if (opt2 != null && (opt2 instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) opt2;
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            Object opt3 = optJSONObject.opt("encodeType");
                            String obj = opt3 == null ? null : opt3.toString();
                            Object opt4 = optJSONObject.opt("url");
                            String obj2 = opt4 == null ? null : opt4.toString();
                            if (obj != null && !TextUtils.isEmpty(obj) && obj2 != null && !TextUtils.isEmpty(obj2)) {
                                hashMap2.put(obj, obj2);
                            }
                            Object opt5 = optJSONObject.opt(VideoControllerManager.KEY_CACHEKEY);
                            String obj3 = opt5 == null ? null : opt5.toString();
                            if (obj != null && !TextUtils.isEmpty(obj) && obj3 != null && !TextUtils.isEmpty(obj3)) {
                                hashMap3.put(obj, obj3);
                            }
                        }
                    }
                }
            }
            if (hashMap2.containsKey("h265")) {
                str = (String) hashMap2.get("h265");
                str2 = (String) hashMap3.get("h265");
            } else {
                str2 = null;
                str = null;
            }
            if (str == null || TextUtils.isEmpty(str)) {
                str = (String) hashMap2.get("h264");
                str2 = (String) hashMap3.get("h264");
            }
            if (str != null && !TextUtils.isEmpty(str)) {
                if (parseInt < 1048576) {
                    parseInt = 1048576;
                }
                if (str.startsWith(itw.URL_SEPARATOR)) {
                    str = "http:".concat(str);
                }
                if (str.contains(".m3u8")) {
                    return null;
                }
                StringBuilder sb = new StringBuilder(100);
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    sb.append("videoCacheId=".concat(str2));
                }
                String b2 = ew0.b(str, sb);
                if (!TextUtils.isEmpty(a7m.b(context, b2))) {
                    if (wbdVar != null) {
                        try {
                            wbdVar.onStart(str);
                            wbdVar.onFinish(1048576);
                        } catch (Throwable unused) {
                        }
                    }
                    return str;
                }
                t7b d = a7m.d(context);
                if (d != null && d.D()) {
                    if (d.E(b2)) {
                        if (wbdVar != null) {
                            try {
                                wbdVar.onStart(str);
                                wbdVar.onFinish(1048576);
                            } catch (Throwable unused2) {
                            }
                        }
                        return str;
                    }
                    sb.append("&");
                    sb.append("preLoad=true");
                    String optString = jSONObject.optString("videoId");
                    if (!TextUtils.isEmpty(optString)) {
                        sb.append("&");
                        sb.append("videoId=" + optString);
                    }
                    if (hashMap != null) {
                        String str3 = hashMap.get("from");
                        if (!TextUtils.isEmpty(str3)) {
                            sb.append("&");
                            sb.append("bizCode=" + str3);
                        }
                        String str4 = hashMap.get(a7m.VIDEO_PLAY_SCENES);
                        if (!TextUtils.isEmpty(str4)) {
                            sb.append("&");
                            sb.append("videoPlayScenes=" + str4);
                        }
                    }
                    c().b(d.v(ew0.b(str, sb)), ew0.l(context), parseInt);
                    rmm.e().c(str2, str, wbdVar);
                    if (wbdVar != null) {
                        try {
                            wbdVar.onStart(str);
                        } catch (Throwable unused3) {
                        }
                    }
                    return str;
                }
            }
        }
        return null;
    }
}
