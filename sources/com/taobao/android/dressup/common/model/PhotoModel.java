package com.taobao.android.dressup.common.model;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.afi;
import tb.ckf;
import tb.t2o;
import tb.xmo;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/taobao/android/dressup/common/model/PhotoModel;", "Ltb/afi;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", xmo.SP_KEY_MAIN_PIC_URL, "Ljava/lang/String;", "getMainPicUrl", "()Ljava/lang/String;", "setMainPicUrl", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "cacheDrawable", "Landroid/graphics/drawable/Drawable;", "getCacheDrawable", "()Landroid/graphics/drawable/Drawable;", "setCacheDrawable", "(Landroid/graphics/drawable/Drawable;)V", "picQuality", "getPicQuality", "setPicQuality", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class PhotoModel extends afi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable cacheDrawable;
    private String mainPicUrl;
    public String picQuality;

    static {
        t2o.a(918552674);
    }

    public PhotoModel() {
        super("pic");
    }

    public static /* synthetic */ Object ipc$super(PhotoModel photoModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/model/PhotoModel");
    }

    public final Drawable getCacheDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("14c44a09", new Object[]{this});
        }
        return this.cacheDrawable;
    }

    public final String getMainPicUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e33fe0e5", new Object[]{this});
        }
        return this.mainPicUrl;
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

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.mainPicUrl;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object anchors = getAnchors();
        if (anchors != null) {
            i2 = anchors.hashCode();
        }
        return i3 + i2;
    }

    public final void setCacheDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea8ef29", new Object[]{this, drawable});
        } else {
            this.cacheDrawable = drawable;
        }
    }

    public final void setMainPicUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba5c331", new Object[]{this, str});
        } else {
            this.mainPicUrl = str;
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

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!ckf.b(PhotoModel.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            PhotoModel photoModel = (PhotoModel) obj;
            return ckf.b(this.mainPicUrl, photoModel.mainPicUrl) && ckf.b(getAnchors(), photoModel.getAnchors());
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.model.PhotoModel");
    }
}
