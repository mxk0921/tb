package com.taobao.umipublish.monitor;

import android.text.TextUtils;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.cg9;
import tb.dov;
import tb.e0o;
import tb.fkg;
import tb.kfv;
import tb.krq;
import tb.odg;
import tb.t2o;
import tb.tep;
import tb.ydv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UmiPublishMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "PublishFullChainMonitor";
    public static final List<String> d = Arrays.asList("draft");
    public static final List<String> e = Arrays.asList("3006", "3007", "3008", "4005", "5001");

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, UmiPublishTracker> f14079a;
    public final Map<String, Map<String, String>> b;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class UmiPublishTracker implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public JSONObject biz;
        public ErrorMeta error;
        public ExtraInfo extra;
        public NodeInfo info;
        public String location;
        public String publish_id;
        public String umimonitor_error_code;
        public String umimonitor_error_msg;
        public String umimonitor_error_subcode;
        public String umimonitor_info_node;
        public String umimonitor_video_biz_code;
        public List<VideoMeta> videos = new ArrayList();
        public List<ImageMeta> photos = new ArrayList();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class ImageMeta implements Serializable {
            public ImageMetaInfo edit_meta;
            public ImageMetaInfo origin_meta;
            public PublishMetaInfo publish_meta;

            static {
                t2o.a(944767242);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class ImageMetaInfo implements Serializable {
            public String file_path;
            public String format;
            public String resolution;
            public JSONObject stat_info;

            static {
                t2o.a(944767243);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class NodeInfo implements Serializable {
            public JSONObject data;
            public String node;

            static {
                t2o.a(944767244);
            }

            public NodeInfo(String str, JSONObject jSONObject) {
                this.node = str;
                this.data = jSONObject;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class VideoMeta implements Serializable {
            public VideoMetaInfo edit_meta;
            public VideoMetaInfo origin_meta;
            public PublishMetaInfo publish_meta;

            static {
                t2o.a(944767246);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class VideoMetaInfo implements Serializable {
            public String audio_bps;
            public String audio_format;
            public ImageMetaInfo cover_meta;
            public long duration;
            public String file_path;
            public String file_size;
            public String fps;
            public String resolution;
            public JSONObject stat_info;
            public String video_bps;
            public String video_format;

            static {
                t2o.a(944767247);
            }
        }

        static {
            t2o.a(944767239);
        }

        @JSONField(serialize = false)
        public String toErrorString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1988aafb", new Object[]{this});
            }
            String jSONString = JSON.toJSONString(this);
            HashMap hashMap = new HashMap();
            hashMap.put("umimonitor_error_code", this.umimonitor_error_code);
            hashMap.put("umimonitor_error_msg", this.umimonitor_error_msg);
            hashMap.put("umimonitor_error_subcode", this.umimonitor_error_subcode);
            hashMap.put("umimonitor_video_biz_code", this.umimonitor_video_biz_code);
            hashMap.put("umi_pub_session", this.publish_id);
            try {
                hashMap.put("umimonitor_full_message", URLEncoder.encode(jSONString, "UTF-8"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return krq.s(hashMap, "=", ",");
        }

        @JSONField(serialize = false)
        public String toInfoString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("920813ff", new Object[]{this});
            }
            String jSONString = JSON.toJSONString(this);
            HashMap hashMap = new HashMap();
            hashMap.put("umimonitor_info_node", this.umimonitor_info_node);
            hashMap.put("umimonitor_video_biz_code", this.umimonitor_video_biz_code);
            hashMap.put("umi_pub_session", this.publish_id);
            try {
                hashMap.put("umimonitor_full_message", URLEncoder.encode(jSONString, "UTF-8"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return krq.s(hashMap, "=", ",");
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class PublishMetaInfo implements Serializable {
            public String remote_url;
            public String upload_id;

            static {
                t2o.a(944767245);
            }

            public PublishMetaInfo(String str) {
                this.upload_id = str;
            }

            public PublishMetaInfo() {
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class ErrorMeta implements Serializable {
            public String code;
            public String info;
            public String msg;
            public String subcode;

            static {
                t2o.a(944767240);
            }

            public ErrorMeta(String str, String str2, String str3) {
                this.code = str;
                this.msg = str2;
                this.info = str3;
            }

            public ErrorMeta(String str, String str2, String str3, String str4) {
                this.code = str;
                this.subcode = str2;
                this.msg = str3;
                this.info = str4;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class ExtraInfo implements Serializable {
            public String contentId;
            public String postType;
            public String uploadMode = "ASYNC";
            public String videoExportEncodeType = "none";
            public String videoImportEncodeType = "none";

            static {
                t2o.a(944767241);
            }

            public ExtraInfo(String str) {
                this.contentId = str;
            }

            public ExtraInfo() {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final UmiPublishMonitor f14080a = new UmiPublishMonitor();

        static {
            t2o.a(944767238);
        }

        public static /* synthetic */ UmiPublishMonitor a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UmiPublishMonitor) ipChange.ipc$dispatch("482fdc20", new Object[0]);
            }
            return f14080a;
        }
    }

    static {
        t2o.a(944767232);
    }

    public static <T> void B(String str, T... tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15d9c9f", new Object[]{str, tArr});
        } else {
            TLog.loge(UT_PAGE_NAME, str, odg.a(str, tArr));
        }
    }

    public static UmiPublishMonitor w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UmiPublishMonitor) ipChange.ipc$dispatch("acf8167a", new Object[0]);
        }
        return b.a();
    }

    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593166f2", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76827979", new Object[]{this, str});
        } else {
            c("onion_album", "1206", "native_onion_album_single_template_list_fetch_fail", str);
        }
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13993f51", new Object[]{this, str});
        } else {
            c("onion_album", "1205", "native_onion_album_tab_list_fetch_fail", str);
        }
    }

    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c98e03", new Object[]{this, str});
        } else {
            c("draft", "4001", "open_draft_db_failed", str);
        }
    }

    public void G(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a99879d", new Object[]{this, str, str2});
        } else {
            l(str, fkg.PAGE_PUBLISH, "3002", "picture_upload_error", str2);
        }
    }

    public void H(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddcb3175", new Object[]{this, str, str2});
        } else {
            l(str, fkg.PAGE_PUBLISH, "3006", "single_picture_upload_error", str2);
        }
    }

    public void I(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a14f46cd", new Object[]{this, str, str2});
        } else {
            l(str, fkg.PAGE_PUBLISH, "3008", "single_video_cover_upload_error", str2);
        }
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f819fbae", new Object[]{this, str, str2});
            return;
        }
        i(str, "start", "publish_start", "type", str2);
        com.taobao.umipublish.monitor.a.c((Map) ((HashMap) this.b).get(str));
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07c171c", new Object[]{this, str});
        } else {
            c(fkg.PAGE_PUBLISH, "3001", "form_render_error", str);
        }
    }

    public void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12b6a4c", new Object[]{this, str});
        } else {
            c(fkg.PAGE_PUBLISH, "3001", "form_render_fail", str);
        }
    }

    public void N(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4889a5", new Object[]{this, str, str2});
        } else {
            l(str, fkg.PAGE_PUBLISH, "3002", "video_cover_upload_error", str2);
        }
    }

    public void O(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7859a6", new Object[]{this, str, str2});
        } else {
            e(str, fkg.PAGE_PUBLISH, "3002", str2, "video_upload_error", null, y(str).get(dov.URL_KEY_VIDEO_BIZ_CODE), false);
        }
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b802b752", new Object[]{this, str});
        } else {
            c("draft", "4003", "save_draft_failed", str);
        }
    }

    public void Q(String str, UmiPublishTracker.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efeb7fb", new Object[]{this, str, extraInfo});
            return;
        }
        UmiPublishTracker x = x(str);
        if (extraInfo != null) {
            x.extra = extraInfo;
        }
    }

    public void R(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741c0097", new Object[]{this, str, str2});
            return;
        }
        UmiPublishTracker x = x(str);
        if (x.extra == null) {
            x.extra = new UmiPublishTracker.ExtraInfo();
        }
        x.extra.postType = str2;
    }

    public void S(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38404db8", new Object[]{this, str, str2});
            return;
        }
        UmiPublishTracker x = x(str);
        if (x.extra == null) {
            x.extra = new UmiPublishTracker.ExtraInfo();
        }
        x.extra.videoExportEncodeType = str2;
    }

    public void T(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7679ef69", new Object[]{this, str, str2});
            return;
        }
        UmiPublishTracker x = x(str);
        if (x.extra == null) {
            x.extra = new UmiPublishTracker.ExtraInfo();
        }
        x.extra.videoImportEncodeType = str2;
    }

    public void U(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8623a34", new Object[]{this, str, str2});
            return;
        }
        UmiPublishTracker x = x(str);
        if (x.extra == null) {
            x.extra = new UmiPublishTracker.ExtraInfo();
        }
        x.extra.contentId = str2;
    }

    public void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9155cc30", new Object[]{this, str, str2, new Long(j)});
        } else {
            b(str, str2, j, null);
        }
    }

    public void b(String str, String str2, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba842955", new Object[]{this, str, str2, new Long(j), map});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", (Object) Long.valueOf(j));
        if (map != null) {
            for (String str3 : map.keySet()) {
                jSONObject.put(str3, (Object) map.get(str3));
            }
        }
        h(str, fkg.PAGE_PUBLISH, str2, jSONObject);
    }

    public void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1b0f69", new Object[]{this, str, str2, str3, str4});
        } else {
            e(this.c, str, str2, null, str3, str4, null, false);
        }
    }

    public void d(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bc90f3", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            e(this.c, str, str2, str3, str4, str5, null, false);
        }
    }

    public synchronized void e(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        String str8;
        String str9;
        boolean z2 = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e74c3b2d", new Object[]{this, str, str2, str3, str4, str5, str6, str7, new Boolean(z)});
                return;
            }
            UmiPublishTracker x = x(str);
            if (x.biz == null) {
                z(str, y(str));
            }
            x.location = str2;
            x.umimonitor_error_code = str3;
            x.umimonitor_error_msg = str5;
            if (TextUtils.isEmpty(str4)) {
                str8 = str4;
            } else {
                str8 = str4.replace(",", " ");
            }
            x.umimonitor_error_subcode = str8;
            x.umimonitor_video_biz_code = str7;
            x.umimonitor_info_node = null;
            x.error = new UmiPublishTracker.ErrorMeta(str3, str4, str5, str6);
            String str10 = y(str).get("biz_scene");
            if (!z && !d.contains(str2) && !e.contains(str3) && !ydv.s(str3)) {
                z2 = false;
            }
            if (z2) {
                str9 = "PublishFullChainMonitor_warning";
            } else {
                str9 = "PublishFullChainMonitor_error";
            }
            TBS.Ext.commitEvent(UT_PAGE_NAME, 19999, str9, str10, null, x.toErrorString());
        }
    }

    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ed41e1", new Object[]{this, str, str2});
        } else {
            h(str, fkg.PAGE_PUBLISH, str2, null);
        }
    }

    public synchronized void g(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3818792f", new Object[]{this, str, str2, jSONObject});
        } else {
            h(this.c, str, str2, jSONObject);
        }
    }

    public synchronized void h(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d87bee5", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        UmiPublishTracker x = x(str);
        if (x.biz == null) {
            z(str, y(str));
        }
        x.location = str2;
        x.info = new UmiPublishTracker.NodeInfo(str3, jSONObject);
        x.umimonitor_error_msg = null;
        x.umimonitor_error_code = null;
        x.umimonitor_error_subcode = null;
        x.error = null;
        x.umimonitor_info_node = str3;
        x.umimonitor_video_biz_code = y(str).get(dov.URL_KEY_VIDEO_BIZ_CODE);
        TBS.Ext.commitEvent(UT_PAGE_NAME, 19999, "PublishFullChainMonitor_info", y(str).get("biz_scene"), null, x.toInfoString());
    }

    public void i(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e630ff", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            jSONObject.put(str4, (Object) str5);
        }
        h(str, str2, str3, jSONObject);
    }

    public void j(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2508529", new Object[]{this, str, str2, str3});
            return;
        }
        UmiPublishTracker x = x(str);
        List<UmiPublishTracker.VideoMeta> list = x.videos;
        if (!(list == null || list.isEmpty())) {
            for (UmiPublishTracker.VideoMeta videoMeta : x.videos) {
                UmiPublishTracker.VideoMetaInfo videoMetaInfo = videoMeta.origin_meta;
                if (videoMetaInfo != null && TextUtils.equals(videoMetaInfo.file_path, str2)) {
                    videoMeta.publish_meta = new UmiPublishTracker.PublishMetaInfo(str3);
                }
            }
        }
    }

    public void k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666db101", new Object[]{this, str, str2, str3});
            return;
        }
        UmiPublishTracker x = x(str);
        List<UmiPublishTracker.ImageMeta> list = x.photos;
        if (!(list == null || list.isEmpty())) {
            for (UmiPublishTracker.ImageMeta imageMeta : x.photos) {
                UmiPublishTracker.ImageMetaInfo imageMetaInfo = imageMeta.origin_meta;
                if (imageMetaInfo != null && TextUtils.equals(imageMetaInfo.file_path, str2)) {
                    UmiPublishTracker.PublishMetaInfo publishMetaInfo = new UmiPublishTracker.PublishMetaInfo();
                    imageMeta.publish_meta = publishMetaInfo;
                    publishMetaInfo.remote_url = str3;
                }
            }
        }
    }

    public void l(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26bc8d4", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            e(str, str2, str3, str5, str4, null, null, false);
        }
    }

    public void m(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab479b27", new Object[]{this, str, str2, str3, new Long(j)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", (Object) Long.valueOf(j));
        jSONObject.put("url", (Object) str3);
        h(str, fkg.PAGE_PUBLISH, str2, jSONObject);
    }

    public void n(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e7064a", new Object[]{this, str, str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str3)) {
            jSONObject.put(e0o.FEATURE_LOCAL_URL, (Object) str3);
            jSONObject.put("file_size", (Object) Long.valueOf(cg9.k(str3)));
        }
        h(str, fkg.PAGE_PUBLISH, str2, jSONObject);
    }

    public void o(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4517d79d", new Object[]{this, str, str2, str3, str4});
        } else {
            e(this.c, str, str2, null, str3, str4, null, true);
        }
    }

    public void p(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16884231", new Object[]{this, str, str2, str3, str4, str5, str6});
        } else {
            e(str, str2, str3, str6, str4, str5, null, true);
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce33fa2b", new Object[]{this, str});
        } else {
            c("draft", "4003", "delete_drafts_failed", str);
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3608eab4", new Object[]{this, str});
        } else {
            c(fkg.PAGE_PUBLISH, "2103", "video_exported_fail", str);
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896d777a", new Object[]{this, str});
        } else {
            c("draft", "4003", "fetch_drafts_failed", str);
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5deb0dcd", new Object[]{this, str});
        } else {
            c("draft", "4003", "fetch_single_draft_failed", str);
        }
    }

    public UmiPublishTracker.ExtraInfo v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UmiPublishTracker.ExtraInfo) ipChange.ipc$dispatch("a7d9aef1", new Object[]{this, str});
        }
        UmiPublishTracker x = x(str);
        if (x.extra == null) {
            x.extra = new UmiPublishTracker.ExtraInfo();
        }
        return x.extra;
    }

    public UmiPublishTracker x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UmiPublishTracker) ipChange.ipc$dispatch("1e1eeba5", new Object[]{this, str});
        }
        if (((HashMap) this.f14079a).get(str) == null) {
            ((HashMap) this.f14079a).put(str, new UmiPublishTracker());
        }
        return (UmiPublishTracker) ((HashMap) this.f14079a).get(str);
    }

    public final Map<String, String> y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e6224a5", new Object[]{this, str});
        }
        if (((HashMap) this.b).get(str) == null) {
            ((HashMap) this.b).put(str, new HashMap());
        }
        return (Map) ((HashMap) this.b).get(str);
    }

    public void z(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32373243", new Object[]{this, str, map});
            return;
        }
        y(str).clear();
        y(str).putAll(map);
        UmiPublishTracker x = x(str);
        x.biz = (JSONObject) JSON.toJSON(map);
        x.publish_id = map.get("umi_pub_session");
    }

    public UmiPublishMonitor() {
        this.f14079a = new HashMap();
        this.b = new HashMap();
    }

    public void F(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f099ec0e", new Object[]{this, str, str2, str3});
            return;
        }
        e(str, fkg.PAGE_PUBLISH, "3004", str2, "form_submit_fail", str2 + "," + str3, "", false);
        com.taobao.umipublish.monitor.a.a((Map) ((HashMap) this.b).get(str), x(str), "", false);
    }

    public void J(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaa037e", new Object[]{this, str, str2});
            return;
        }
        l(str, fkg.PAGE_PUBLISH, "3007", "single_video_upload_error", str2);
        com.taobao.umipublish.monitor.a.b((Map) ((HashMap) this.b).get(str), x(str), null, false);
    }

    public void W(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bde1e66", new Object[]{this, iUGCMedia});
        } else if (iUGCMedia != null) {
            try {
                UmiPublishTracker x = x(iUGCMedia.getPublishSessionId());
                x.photos.clear();
                x.videos.clear();
                if (iUGCMedia.getImages() != null && iUGCMedia.getImages().size() > 0) {
                    for (UGCImage uGCImage : iUGCMedia.getImages()) {
                        UmiPublishTracker.ImageMeta imageMeta = new UmiPublishTracker.ImageMeta();
                        if (uGCImage.origin != null) {
                            UmiPublishTracker.ImageMetaInfo imageMetaInfo = new UmiPublishTracker.ImageMetaInfo();
                            imageMeta.origin_meta = imageMetaInfo;
                            imageMetaInfo.file_path = uGCImage.origin.path;
                            imageMetaInfo.resolution = uGCImage.origin.width + "," + uGCImage.origin.height;
                            imageMeta.origin_meta.format = uGCImage.origin.toString();
                        }
                        if (uGCImage.compress != null) {
                            UmiPublishTracker.ImageMetaInfo imageMetaInfo2 = new UmiPublishTracker.ImageMetaInfo();
                            imageMeta.edit_meta = imageMetaInfo2;
                            imageMetaInfo2.file_path = uGCImage.compress.path;
                            imageMetaInfo2.resolution = uGCImage.compress.width + "," + uGCImage.compress.height;
                            imageMeta.edit_meta.format = uGCImage.compress.toString();
                            imageMeta.edit_meta.stat_info = (JSONObject) JSON.toJSON(uGCImage.getMeta("mediaStatInfo"));
                        }
                        x.photos.add(imageMeta);
                    }
                }
                if (iUGCMedia.getVideos() != null && iUGCMedia.getVideos().size() > 0) {
                    UGCVideo uGCVideo = iUGCMedia.getVideos().get(0);
                    UmiPublishTracker.VideoMeta videoMeta = new UmiPublishTracker.VideoMeta();
                    if (uGCVideo.origin != null) {
                        UmiPublishTracker.VideoMetaInfo videoMetaInfo = new UmiPublishTracker.VideoMetaInfo();
                        videoMeta.origin_meta = videoMetaInfo;
                        videoMetaInfo.file_path = uGCVideo.origin.path;
                        videoMetaInfo.resolution = uGCVideo.origin.width + "," + uGCVideo.origin.height;
                        videoMeta.origin_meta.video_format = uGCVideo.origin.toString();
                        videoMeta.origin_meta.file_size = String.valueOf(uGCVideo.origin.fileSize);
                        videoMeta.origin_meta.fps = String.valueOf(uGCVideo.origin.framerate);
                        videoMeta.origin_meta.video_bps = String.valueOf(uGCVideo.origin.bitRate);
                        UmiPublishTracker.VideoMetaInfo videoMetaInfo2 = videoMeta.origin_meta;
                        videoMetaInfo2.duration = uGCVideo.origin.duration;
                        if (uGCVideo.compress == null) {
                            videoMetaInfo2.stat_info = (JSONObject) JSON.toJSON(uGCVideo.getMeta("mediaStatInfo"));
                        }
                    }
                    if (uGCVideo.compress != null) {
                        UmiPublishTracker.VideoMetaInfo videoMetaInfo3 = new UmiPublishTracker.VideoMetaInfo();
                        videoMeta.edit_meta = videoMetaInfo3;
                        videoMetaInfo3.file_path = uGCVideo.compress.path;
                        videoMetaInfo3.resolution = uGCVideo.compress.width + "," + uGCVideo.compress.height;
                        videoMeta.edit_meta.video_format = uGCVideo.compress.toString();
                        videoMeta.edit_meta.file_size = String.valueOf(uGCVideo.compress.fileSize);
                        videoMeta.edit_meta.fps = String.valueOf(uGCVideo.compress.framerate);
                        videoMeta.edit_meta.video_bps = String.valueOf(uGCVideo.compress.bitRate);
                        UmiPublishTracker.VideoMetaInfo videoMetaInfo4 = videoMeta.edit_meta;
                        videoMetaInfo4.duration = uGCVideo.compress.duration;
                        videoMetaInfo4.stat_info = (JSONObject) JSON.toJSON(uGCVideo.getMeta("mediaStatInfo"));
                        if (uGCVideo.compress.cover != null) {
                            videoMeta.edit_meta.cover_meta = new UmiPublishTracker.ImageMetaInfo();
                            UmiPublishTracker.ImageMetaInfo imageMetaInfo3 = videoMeta.edit_meta.cover_meta;
                            imageMetaInfo3.file_path = uGCVideo.compress.cover.path;
                            imageMetaInfo3.resolution = uGCVideo.compress.cover.width + "," + uGCVideo.compress.cover.height;
                            videoMeta.edit_meta.cover_meta.format = uGCVideo.compress.cover.toString();
                            videoMeta.edit_meta.cover_meta.stat_info = (JSONObject) JSON.toJSON(uGCVideo.getMeta("video_cover_stat_info"));
                        }
                    }
                    x.videos.add(videoMeta);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2245adf0", new Object[]{this, jSONObject});
            return;
        }
        UmiPublishTracker x = x(kfv.b().c());
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("deleteItems");
            if (!(jSONArray == null || jSONArray.size() == 0)) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("type");
                    String string2 = jSONObject2.getString("path");
                    if (!TextUtils.isEmpty(string2)) {
                        if (TextUtils.equals(string, "video") && x.videos.size() > 0) {
                            x.videos.clear();
                        } else if (TextUtils.equals(string, "image") && x.photos.size() > 0) {
                            Iterator<UmiPublishTracker.ImageMeta> it = x.photos.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (TextUtils.equals(it.next().origin_meta.file_path, string2)) {
                                        it.remove();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void V(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9054a09", new Object[]{this, jSONObject});
            return;
        }
        UmiPublishTracker x = x(kfv.b().c());
        try {
            x.photos.clear();
            x.videos.clear();
            if ("image".equals(jSONObject.getString("type")) && jSONObject.containsKey("images") && jSONObject.getJSONArray("images") != null && jSONObject.getJSONArray("images").size() > 0) {
                JSONArray jSONArray = jSONObject.getJSONArray("images");
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    UmiPublishTracker.ImageMeta imageMeta = new UmiPublishTracker.ImageMeta();
                    UmiPublishTracker.ImageMetaInfo imageMetaInfo = new UmiPublishTracker.ImageMetaInfo();
                    imageMeta.origin_meta = imageMetaInfo;
                    imageMetaInfo.file_path = jSONObject2.getString("path");
                    UmiPublishTracker.ImageMetaInfo imageMetaInfo2 = imageMeta.origin_meta;
                    imageMetaInfo2.resolution = jSONObject2.getString("width") + "," + jSONObject2.getString("height");
                    imageMeta.origin_meta.format = jSONObject2.getString("type");
                    x.photos.add(imageMeta);
                }
            }
            if ("video".equals(jSONObject.getString("type")) && jSONObject.containsKey("taopai_document")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("taopai_document");
                String string = jSONObject.getString("clip_output_path");
                if (TextUtils.isEmpty(string)) {
                    string = jSONObject.getString("record_output_path");
                }
                if (TextUtils.isEmpty(string) && jSONObject.containsKey("taopai_enter_param") && jSONObject.getJSONObject("taopai_enter_param").getJSONArray(tep.KEY_UNIFORM_RESULT) != null && jSONObject.getJSONObject("taopai_enter_param").getJSONArray(tep.KEY_UNIFORM_RESULT).size() > 0) {
                    string = jSONObject.getJSONObject("taopai_enter_param").getJSONArray(tep.KEY_UNIFORM_RESULT).getJSONObject(0).getString("fileUrl");
                }
                UmiPublishTracker.VideoMeta videoMeta = new UmiPublishTracker.VideoMeta();
                UmiPublishTracker.VideoMetaInfo videoMetaInfo = new UmiPublishTracker.VideoMetaInfo();
                videoMeta.origin_meta = videoMetaInfo;
                videoMetaInfo.file_path = string;
                JSONArray jSONArray2 = jSONObject3.getJSONArray("canvasSize");
                UmiPublishTracker.VideoMetaInfo videoMetaInfo2 = videoMeta.origin_meta;
                videoMetaInfo2.resolution = jSONArray2.getInteger(0) + "," + jSONArray2.getInteger(1);
                JSONObject jSONObject4 = jSONObject3.getJSONObject("root").getJSONArray(ExperimentDO.COLUMN_TRACKS).getJSONObject(0).getJSONArray(ExperimentDO.COLUMN_TRACKS).getJSONObject(0).getJSONObject("metadata");
                videoMeta.origin_meta.video_format = jSONObject4.toJSONString();
                videoMeta.origin_meta.video_bps = jSONObject4.getString("bitRate");
                videoMeta.origin_meta.fps = jSONObject4.getString("frameRate");
                videoMeta.origin_meta.file_size = jSONObject4.getString("fileSize");
                videoMeta.origin_meta.duration = jSONObject4.getFloat("duration").floatValue() * 1000.0f;
                x.videos.add(videoMeta);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
