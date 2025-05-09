package com.etao.feimagesearch.capture.dynamic.bean;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.hybrid.TBAlbumImg;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.h19;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MusOuterAlbumBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Long createTime;
    private String imgKey;
    private Float imgRotation;
    private Integer index;
    private boolean remote;
    private String screenShots;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296505);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        @JvmStatic
        public final MusOuterAlbumBean a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MusOuterAlbumBean) ipChange.ipc$dispatch("6014c1fd", new Object[]{this, jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            String i = h19.i(jSONObject, TBAlbumImg.ATTR_IMG_KEY, "");
            if (TextUtils.isEmpty(i)) {
                return null;
            }
            MusOuterAlbumBean musOuterAlbumBean = new MusOuterAlbumBean(null, null, false, null, null, null, 63, null);
            musOuterAlbumBean.setImgKey(i);
            musOuterAlbumBean.setIndex(Integer.valueOf(h19.g(jSONObject, "index", 0)));
            musOuterAlbumBean.setImgRotation(Float.valueOf(h19.f(jSONObject, TBAlbumImg.ATTR_IMG_ROTATION, 0.0f)));
            musOuterAlbumBean.setRemote(h19.e(jSONObject, "remote", false));
            String i2 = h19.i(jSONObject, "screenShots", "false");
            ckf.f(i2, "parseString(json, \"screenShots\", \"false\")");
            musOuterAlbumBean.setScreenShots(i2);
            musOuterAlbumBean.setCreateTime(Long.valueOf(h19.h(jSONObject, "createTime", -1L)));
            return musOuterAlbumBean;
        }
    }

    static {
        t2o.a(481296504);
    }

    public MusOuterAlbumBean() {
        this(null, null, false, null, null, null, 63, null);
    }

    public static /* synthetic */ MusOuterAlbumBean copy$default(MusOuterAlbumBean musOuterAlbumBean, String str, Float f, boolean z, Integer num, String str2, Long l, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusOuterAlbumBean) ipChange.ipc$dispatch("4add328d", new Object[]{musOuterAlbumBean, str, f, new Boolean(z), num, str2, l, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = musOuterAlbumBean.imgKey;
        }
        if ((i & 2) != 0) {
            f = musOuterAlbumBean.imgRotation;
        }
        if ((i & 4) != 0) {
            z = musOuterAlbumBean.remote;
        }
        if ((i & 8) != 0) {
            num = musOuterAlbumBean.index;
        }
        if ((i & 16) != 0) {
            str2 = musOuterAlbumBean.screenShots;
        }
        if ((i & 32) != 0) {
            l = musOuterAlbumBean.createTime;
        }
        return musOuterAlbumBean.copy(str, f, z, num, str2, l);
    }

    @JvmStatic
    public static final MusOuterAlbumBean parseFromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusOuterAlbumBean) ipChange.ipc$dispatch("6014c1fd", new Object[]{jSONObject});
        }
        return Companion.a(jSONObject);
    }

    public final String component1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dfa78a5", new Object[]{this});
        }
        return this.imgKey;
    }

    public final Float component2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("b7f79125", new Object[]{this});
        }
        return this.imgRotation;
    }

    public final boolean component3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f20ac61", new Object[]{this})).booleanValue();
        }
        return this.remote;
    }

    public final Integer component4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d6e66785", new Object[]{this});
        }
        return this.index;
    }

    public final String component5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98116321", new Object[]{this});
        }
        return this.screenShots;
    }

    public final Long component6() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("de9aea35", new Object[]{this});
        }
        return this.createTime;
    }

    public final MusOuterAlbumBean copy(String str, Float f, boolean z, Integer num, String str2, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusOuterAlbumBean) ipChange.ipc$dispatch("46e05e58", new Object[]{this, str, f, new Boolean(z), num, str2, l});
        }
        ckf.g(str2, "screenShots");
        return new MusOuterAlbumBean(str, f, z, num, str2, l);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusOuterAlbumBean)) {
            return false;
        }
        MusOuterAlbumBean musOuterAlbumBean = (MusOuterAlbumBean) obj;
        if (ckf.b(this.imgKey, musOuterAlbumBean.imgKey) && ckf.b(this.imgRotation, musOuterAlbumBean.imgRotation) && this.remote == musOuterAlbumBean.remote && ckf.b(this.index, musOuterAlbumBean.index) && ckf.b(this.screenShots, musOuterAlbumBean.screenShots) && ckf.b(this.createTime, musOuterAlbumBean.createTime)) {
            return true;
        }
        return false;
    }

    public final Long getCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("53ced16f", new Object[]{this});
        }
        return this.createTime;
    }

    public final String getImgKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("685167a7", new Object[]{this});
        }
        return this.imgKey;
    }

    public final Float getImgRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("b624667b", new Object[]{this});
        }
        return this.imgRotation;
    }

    public final Integer getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("9408020a", new Object[]{this});
        }
        return this.index;
    }

    public final boolean getRemote() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c3fa1c7", new Object[]{this})).booleanValue();
        }
        return this.remote;
    }

    public final String getScreenShots() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("547930e2", new Object[]{this});
        }
        return this.screenShots;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.imgKey;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = i * 31;
        Float f = this.imgRotation;
        if (f == null) {
            i2 = 0;
        } else {
            i2 = f.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        boolean z = this.remote;
        if (!z) {
            i5 = z ? 1 : 0;
        }
        int i8 = (i7 + i5) * 31;
        Integer num = this.index;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int hashCode = (((i8 + i3) * 31) + this.screenShots.hashCode()) * 31;
        Long l = this.createTime;
        if (l != null) {
            i4 = l.hashCode();
        }
        return hashCode + i4;
    }

    public final void setCreateTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdef3b31", new Object[]{this, l});
        } else {
            this.createTime = l;
        }
    }

    public final void setImgKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41857aaf", new Object[]{this, str});
        } else {
            this.imgKey = str;
        }
    }

    public final void setImgRotation(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da494f3", new Object[]{this, f});
        } else {
            this.imgRotation = f;
        }
    }

    public final void setIndex(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4af700", new Object[]{this, num});
        } else {
            this.index = num;
        }
    }

    public final void setRemote(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21abce5", new Object[]{this, new Boolean(z)});
        } else {
            this.remote = z;
        }
    }

    public final void setScreenShots(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52641a3c", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.screenShots = str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MusOuterAlbumBean(imgKey=" + ((Object) this.imgKey) + ", imgRotation=" + this.imgRotation + ", remote=" + this.remote + ", index=" + this.index + ", screenShots=" + this.screenShots + ", createTime=" + this.createTime + ')';
    }

    public MusOuterAlbumBean(String str, Float f, boolean z, Integer num, String str2, Long l) {
        ckf.g(str2, "screenShots");
        this.imgKey = str;
        this.imgRotation = f;
        this.remote = z;
        this.index = num;
        this.screenShots = str2;
        this.createTime = l;
    }

    public /* synthetic */ MusOuterAlbumBean(String str, Float f, boolean z, Integer num, String str2, Long l, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? "false" : str2, (i & 32) != 0 ? null : l);
    }
}
