package com.taobao.android.dressup.common.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.afi;
import tb.ckf;
import tb.t2o;
import tb.xmo;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\"\u0010 \u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010#\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"Lcom/taobao/android/dressup/common/model/LivePhotoModel;", "Ltb/afi;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", xmo.SP_KEY_MAIN_PIC_URL, "Ljava/lang/String;", "getMainPicUrl", "()Ljava/lang/String;", "setMainPicUrl", "(Ljava/lang/String;)V", "picQuality", "getPicQuality", "setPicQuality", "Lcom/alibaba/fastjson/JSONObject;", "originalData", "Lcom/alibaba/fastjson/JSONObject;", "getOriginalData", "()Lcom/alibaba/fastjson/JSONObject;", "setOriginalData", "(Lcom/alibaba/fastjson/JSONObject;)V", "playScene", "getPlayScene", "setPlayScene", "bizCode", "getBizCode", "setBizCode", "playSource", "getPlaySource", "setPlaySource", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LivePhotoModel extends afi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mainPicUrl;
    private JSONObject originalData;
    public String picQuality;
    @JSONField(deserialize = false, serialize = false)
    private String playScene = "gg_artical_live_photo";
    @JSONField(deserialize = false, serialize = false)
    private String bizCode = "guangguang";
    @JSONField(deserialize = false, serialize = false)
    private String playSource = "NonTBVideo";

    static {
        t2o.a(918552668);
    }

    public LivePhotoModel() {
        super("pic");
    }

    public static /* synthetic */ Object ipc$super(LivePhotoModel livePhotoModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/model/LivePhotoModel");
    }

    public final String getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.bizCode;
    }

    public final String getMainPicUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e33fe0e5", new Object[]{this});
        }
        return this.mainPicUrl;
    }

    public final JSONObject getOriginalData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b45ceb8", new Object[]{this});
        }
        return this.originalData;
    }

    public final String getPicQuality() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0bec3ce", new Object[]{this});
        }
        String str = this.picQuality;
        if (str != null) {
            return str;
        }
        ckf.y("picQuality");
        throw null;
    }

    public final String getPlayScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a09e1537", new Object[]{this});
        }
        return this.playScene;
    }

    public final String getPlaySource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfef6fb4", new Object[]{this});
        }
        return this.playSource;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.originalData;
        if (jSONObject != null) {
            return jSONObject.hashCode();
        }
        return 0;
    }

    public final void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.bizCode = str;
    }

    public final void setMainPicUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba5c331", new Object[]{this, str});
        } else {
            this.mainPicUrl = str;
        }
    }

    public final void setOriginalData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2c6cc", new Object[]{this, jSONObject});
        } else {
            this.originalData = jSONObject;
        }
    }

    public final void setPicQuality(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae033d68", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.picQuality = str;
    }

    public final void setPlayScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5624d87", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.playScene = str;
    }

    public final void setPlaySource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e80e42", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.playSource = str;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!ckf.b(LivePhotoModel.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return ckf.b(this.originalData, ((LivePhotoModel) obj).originalData);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.model.LivePhotoModel");
    }
}
