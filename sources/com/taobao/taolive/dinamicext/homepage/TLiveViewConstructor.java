package com.taobao.taolive.dinamicext.homepage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.taolive.uikit.homepage.TLiveView;
import tb.arq;
import tb.sn7;
import tb.t2o;
import tb.xm7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TLiveViewConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CUSTOM_ATTR_COVER_URL = "tCoverUrl";
    private static final String CUSTOM_ATTR_DURATION = "tDuration";
    private static final String CUSTOM_ATTR_IMAGE_SCALE = "tScaleType";
    private static final String CUSTOM_ATTR_LIVE_ID = "tLiveID";
    private static final String CUSTOM_ATTR_LIVE_URL = "tLiveUrl";
    private static final String CUSTOM_ATTR_PLAYER_DATA = "tPlayerData";

    static {
        t2o.a(779092449);
    }

    public static /* synthetic */ Object ipc$super(TLiveViewConstructor tLiveViewConstructor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/homepage/TLiveViewConstructor");
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        return new TLiveView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_COVER_URL})
    public void setCoverUrl(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f4ac45", new Object[]{this, tLiveView, str});
        } else if (tLiveView != null) {
            tLiveView.setImageUrl(str);
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_DURATION})
    public void setDuration(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb47b69", new Object[]{this, tLiveView, str});
        } else if (tLiveView != null) {
            tLiveView.setDuration(arq.f(str));
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_IMAGE_SCALE})
    public void setImageScaleType(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168445d4", new Object[]{this, tLiveView, str});
        } else if (!TextUtils.isEmpty(str) && tLiveView != null) {
            tLiveView.setScaleType(xm7.e(str));
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_LIVE_ID})
    public void setLiveID(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd0d096", new Object[]{this, tLiveView, str});
        } else if (tLiveView != null) {
            tLiveView.setLiveId(str);
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_LIVE_URL})
    public void setLiveUrl(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf53917e", new Object[]{this, tLiveView, str});
        } else if (tLiveView != null) {
            tLiveView.setLiveUrl(str);
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_PLAYER_DATA})
    public void setPlayerData(TLiveView tLiveView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470ee7c8", new Object[]{this, tLiveView, jSONObject});
        } else if (tLiveView != null && jSONObject != null) {
            tLiveView.setPlayerData(jSONObject);
        }
    }
}
