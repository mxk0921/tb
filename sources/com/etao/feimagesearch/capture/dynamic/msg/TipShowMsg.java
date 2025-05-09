package com.etao.feimagesearch.capture.dynamic.msg;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.q22;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TipShowMsg extends q22 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOW_AREA_CENTER = "center";

    /* renamed from: a  reason: collision with root package name */
    public final String f4659a;
    public final long b;
    public final String c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum TipShowType {
        TEXT_TYPE("text"),
        ALERT_TYPE("alert");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String type;

        TipShowType(String str) {
            this.type = str;
        }

        public static /* synthetic */ String access$000(TipShowType tipShowType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4435b6c3", new Object[]{tipShowType});
            }
            return tipShowType.type;
        }

        public static /* synthetic */ Object ipc$super(TipShowType tipShowType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/msg/TipShowMsg$TipShowType");
        }

        public static TipShowType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TipShowType) ipChange.ipc$dispatch("cea2c5bd", new Object[]{str});
            }
            return (TipShowType) Enum.valueOf(TipShowType.class, str);
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.type;
        }
    }

    static {
        t2o.a(481296671);
    }

    public TipShowMsg(String str, Long l, String str2, TipShowType tipShowType) {
        this.f4659a = str;
        this.b = l.longValue();
        this.c = str2;
        this.d = TipShowType.access$000(tipShowType);
    }

    public static /* synthetic */ Object ipc$super(TipShowMsg tipShowMsg, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/msg/TipShowMsg");
    }

    @Override // tb.q22
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0ca9f4", new Object[]{this});
        }
        return "cameraShowTips";
    }

    @Override // tb.q22
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6b386517", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tip", (Object) this.f4659a);
        jSONObject.put("time", (Object) Long.valueOf(this.b));
        jSONObject.put("scene", (Object) this.c);
        jSONObject.put("type", (Object) this.d);
        return jSONObject;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5dadc25", new Object[]{this});
        }
        return this.f4659a;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f43770ea", new Object[]{this})).longValue();
        }
        return this.b;
    }
}
