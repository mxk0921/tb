package tb;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.security.realidentity.j3;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vlu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f30094a;
    public List<String> b;
    public List<String> c;
    public List<String> d;
    public List<String> e;
    public List<String> f;
    public List<String> g;
    public List<a> h;
    public List<a> i;
    public List<a> j;
    public List<a> k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f30095a;
        public Map<String, String> b;

        static {
            t2o.a(395313686);
        }
    }

    static {
        t2o.a(395313685);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cf5bafc", new Object[0]);
        }
        try {
            return er2.f(blt.f("/proc/cpuinfo"));
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean h(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc066d43", new Object[]{list, str})).booleanValue();
        }
        for (String str2 : list) {
            if (str.length() >= str2.length() && str.substring(0, str2.length()).equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public List<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46310748", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return Arrays.asList(str.split(";"));
        }
        return new ArrayList();
    }

    public final a e(List<a> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f589ca4e", new Object[]{this, list, str});
        }
        for (a aVar : list) {
            if (h(this.e, aVar.f30095a) && aVar.f30095a.contains(str)) {
                return aVar;
            }
        }
        return null;
    }

    public a f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4716be9e", new Object[]{this, str});
        }
        if (j3.m.equalsIgnoreCase(str)) {
            List<a> list = this.i;
            if (list != null && !((ArrayList) list).isEmpty()) {
                return d(this.i);
            }
            List<a> list2 = this.h;
            if (list2 != null && !((ArrayList) list2).isEmpty()) {
                return d(this.h);
            }
        }
        if (!"video/hevc".equalsIgnoreCase(str)) {
            return null;
        }
        List<a> list3 = this.k;
        if (list3 != null && !((ArrayList) list3).isEmpty()) {
            return d(this.k);
        }
        List<a> list4 = this.j;
        if (list4 == null || ((ArrayList) list4).isEmpty()) {
            return null;
        }
        return d(this.j);
    }

    public final a d(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3d554152", new Object[]{this, list});
        }
        a e = e(list, "low_latency");
        if (e != null) {
            return e;
        }
        a e2 = e(list, "c2");
        return e2 != null ? e2 : list.get(0);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        List<String> c = c(cmu.f(rlu.TRTC_ORANGE_DEF_STR_HW_DEC_DECODER_PREFIX_BLACKLIST, ""));
        this.b = c(cmu.f(rlu.TRTC_ORANGE_DEF_STR_HW_DEC_CPU_WHITELIST_KEY, ""));
        this.f30094a = c(cmu.f(rlu.TRTC_ORANGE_DEF_STR_HW_DEC_CPU_BLACKLIST_KEY, ""));
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.add("omx.qcom");
        this.e.add("c2.qti");
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        arrayList2.add("omx.hisi");
        ArrayList arrayList3 = new ArrayList();
        this.g = arrayList3;
        arrayList3.add("omx.exynos");
        ArrayList arrayList4 = new ArrayList();
        this.f = arrayList4;
        arrayList4.add("omx.mtk");
        ArrayList arrayList5 = new ArrayList();
        this.c = arrayList5;
        arrayList5.add("omx.google");
        this.c.add("c2.android");
        this.c.add("AVCDecoder");
        this.c.add("OMX.ffmpeg");
        this.c.add("OMX.qcom.video.decoder.hevcswvdec");
        this.c.add("OMX.SEC.hevc.sw.dec");
        if (c != null && !c.isEmpty()) {
            this.c.addAll(c);
        }
        if (cmu.b(rlu.TRTC_ORANGE_DEF_BOOL_HW_DEC_ENABLE_H264, false)) {
            this.h = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            this.i = arrayList6;
            a(j3.m, this.h, arrayList6);
        } else {
            TrtcLog.j("MediaCodecHelper", "hw dec h264 disabled");
        }
        if (cmu.b(rlu.TRTC_ORANGE_DEF_BOOL_HW_DEC_ENABLE_H265, false)) {
            this.j = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            this.k = arrayList7;
            a("video/hevc", this.j, arrayList7);
            return;
        }
        TrtcLog.j("MediaCodecHelper", "hw dec h265 disabled");
    }

    public void j(MediaCodecInfo mediaCodecInfo, String str, MediaFormat mediaFormat, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb3f591", new Object[]{this, mediaCodecInfo, str, mediaFormat, map});
            return;
        }
        if (i(mediaCodecInfo, str)) {
            mediaFormat.setInteger("low-latency", 1);
            map.put("low-latency", "1");
        }
        if (h(this.f, mediaCodecInfo.getName())) {
            mediaFormat.setInteger("vdec-lowlatency", 1);
            map.put("vdec-lowlatency", "1");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (h(this.e, mediaCodecInfo.getName())) {
                mediaFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
                mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
                map.put("vendor.qti-ext-dec-picture-order.enable", "1");
                map.put("vendor.qti-ext-dec-low-latency.enable", "1");
            }
            if (h(this.d, mediaCodecInfo.getName())) {
                mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
                mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
                map.put("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", "1");
                map.put("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", "-1");
            }
            if (h(this.g, mediaCodecInfo.getName())) {
                mediaFormat.setInteger("vendor.rtc-ext-dec-low-latency.enable", 1);
                map.put("vendor.rtc-ext-dec-low-latency.enable", "1");
            }
        }
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de29f9fb", new Object[]{mediaCodecInfo, str})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                if (mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("low-latency")) {
                    TrtcLog.j("MediaCodecHelper", "low-latency supported");
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void a(String str, List<a> list, List<a> list2) {
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbaa207", new Object[]{this, str, list, list2});
            return;
        }
        try {
            String b = b();
            List<String> list3 = this.b;
            if (list3 == null || list3.isEmpty()) {
                List<String> list4 = this.f30094a;
                if (list4 != null && !list4.isEmpty()) {
                    TrtcLog.j("MediaCodecHelper", "CPU-blackList: " + this.f30094a.toString());
                    for (String str2 : this.f30094a) {
                        if (b.contains(str2)) {
                            TrtcLog.i("MediaCodecHelper", "CPU: " + b + " in cpu blackList");
                            return;
                        }
                    }
                }
            } else {
                TrtcLog.j("MediaCodecHelper", "CPU-whiteList: " + this.b.toString());
                for (String str3 : this.b) {
                    if (b.contains(str3)) {
                    }
                }
                TrtcLog.i("MediaCodecHelper", "CPU: " + b + " not in cpu whiteList");
                return;
            }
        } catch (Exception unused) {
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        int length = codecInfos.length;
        int i = 0;
        while (i < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i];
            if (!mediaCodecInfo.isEncoder() && str.equalsIgnoreCase(mediaCodecInfo.getSupportedTypes()[c]) && !h(this.c, mediaCodecInfo.getName()) && !mediaCodecInfo.getName().contains("sw")) {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                mediaFormat.setInteger("color-format", 2130708361);
                if (!capabilitiesForType.isFormatSupported(mediaFormat)) {
                    TrtcLog.i("MediaCodecHelper", "Decoder check, name: " + mediaCodecInfo.getName() + ", basic format: " + mediaFormat.toString() + " not supported for " + str);
                } else {
                    a aVar = new a();
                    aVar.f30095a = mediaCodecInfo.getName();
                    aVar.b = new HashMap();
                    list.add(aVar);
                    MediaFormat mediaFormat2 = new MediaFormat();
                    mediaFormat2.setString("mime", str);
                    mediaFormat2.setInteger("color-format", 2130708361);
                    HashMap hashMap = new HashMap();
                    j(mediaCodecInfo, str, mediaFormat2, hashMap);
                    if (capabilitiesForType.isFormatSupported(mediaFormat2)) {
                        ((HashMap) aVar.b).putAll(hashMap);
                        list2.add(aVar);
                    }
                }
            }
            i++;
            c = 0;
        }
    }
}
