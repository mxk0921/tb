package com.taobao.android.litecreator.base.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import tb.ckf;
import tb.ptc;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0016R;\u0010\u0019\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0017j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/taobao/android/litecreator/base/data/meta/UGCBase;", "Ltb/ptc;", "", "Ljava/io/Serializable;", "<init>", "()V", "", "key", "value", "Ltb/xhv;", "setMeta", "(Ljava/lang/String;Ljava/io/Serializable;)V", "addExtraInfoMeta", "removeExtraInfoMeta", "(Ljava/lang/String;)V", "T", "getMeta", "(Ljava/lang/String;)Ljava/lang/Object;", v4s.PARAM_SESSION_ID, "Lcom/taobao/android/litecreator/base/data/meta/MediaStatInfo;", "statInfo", "(Ljava/lang/String;)Lcom/taobao/android/litecreator/base/data/meta/MediaStatInfo;", "()Lcom/taobao/android/litecreator/base/data/meta/MediaStatInfo;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "meta", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "litecreator_protocol_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UGCBase implements ptc, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final HashMap<String, Serializable> meta = new HashMap<>();

    static {
        t2o.a(511705141);
        t2o.a(511705132);
        t2o.a(511705133);
    }

    @Override // tb.ptc
    public void addExtraInfoMeta(String str, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2b09c7", new Object[]{this, str, serializable});
            return;
        }
        JSONObject jSONObject = (JSONObject) getMeta("extraInfo");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put((JSONObject) str, (String) serializable);
        setMeta("extraInfo", jSONObject);
    }

    public final HashMap<String, Serializable> getMeta() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("3ef5e665", new Object[]{this}) : this.meta;
    }

    @Override // tb.ptc
    public void removeExtraInfoMeta(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4233f730", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = (JSONObject) getMeta("extraInfo");
        if (jSONObject != null) {
            jSONObject.remove(str);
        }
    }

    @Override // tb.ptc
    public void setMeta(String str, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0456ec", new Object[]{this, str, serializable});
        } else {
            this.meta.put(str, serializable);
        }
    }

    public MediaStatInfo statInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaStatInfo) ipChange.ipc$dispatch("91c60b7d", new Object[]{this, str});
        }
        ckf.g(str, v4s.PARAM_SESSION_ID);
        MediaStatInfo mediaStatInfo = (MediaStatInfo) getMeta("mediaStatInfo");
        if (mediaStatInfo != null) {
            return mediaStatInfo;
        }
        MediaStatInfo mediaStatInfo2 = new MediaStatInfo(str);
        setMeta("mediaStatInfo", mediaStatInfo2);
        return mediaStatInfo2;
    }

    @Override // tb.ptc
    public <T> T getMeta(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a306ade6", new Object[]{this, str});
        }
        if (!this.meta.containsKey(str)) {
            return null;
        }
        T t = (T) this.meta.get(str);
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    public MediaStatInfo statInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaStatInfo) ipChange.ipc$dispatch("772354f3", new Object[]{this}) : statInfo("");
    }
}
