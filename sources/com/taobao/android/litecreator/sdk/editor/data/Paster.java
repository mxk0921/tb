package com.taobao.android.litecreator.sdk.editor.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.ArrayList;
import java.util.List;
import tb.eag;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Paster extends EditableBean<Paster> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MASK_STICKER_TYPE_ADAPT = 4;
    public static final int MASK_STICKER_TYPE_MUSIC = 2;
    public static final int RES_TYPE_IMAGE = 2;
    public static final int RES_TYPE_MARVEL = 0;
    public static final int RES_TYPE_MARVEL_SUB_PROJECT = 3;
    public static final int RES_TYPE_RACE = 1;
    public static final int TYPE_MIX = 2;
    public static final int TYPE_PIC = 0;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_TEXT_TEMPLATE = 3;
    public String audioId;
    public long endTimeUs;
    public boolean isAlgo;
    public boolean isInTemplate;
    public JSONObject item;
    public String itemImageLocalPath;
    public int itemImageType;
    public String itemImageUrl;
    public int mark;
    public long materialId;
    public String musicId;
    public int musicVendorType;
    public boolean mute;
    public int outlineColor;
    public String path;
    public String resPath;
    public int shadowColor;
    public long startTimeUs;
    public String text;
    public int textColor;
    public String textFontPath;
    public int type = 0;
    public int resType = 0;
    public Transform transform = new Transform();
    public List<PasterChildNode> pasterChildNodes = new ArrayList();

    static {
        t2o.a(511705438);
    }

    public static boolean hasFlag(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("10313d1", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : (i & i2) == i2;
    }

    public static /* synthetic */ Object ipc$super(Paster paster, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/Paster");
    }

    public static Paster mix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paster) ipChange.ipc$dispatch("c5384f79", new Object[0]);
        }
        Paster paster = new Paster();
        paster.type = 2;
        paster.transform.scale = 0.5f;
        return paster;
    }

    public static Paster text() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paster) ipChange.ipc$dispatch("3537970a", new Object[0]);
        }
        Paster paster = new Paster();
        paster.type = 1;
        paster.transform.scale = eag.c();
        paster.transform.postionY = eag.b();
        return paster;
    }

    public boolean isSameAs(Paster paster) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0aee41", new Object[]{this, paster})).booleanValue();
        }
        if (!this.transform.isSameAs(paster.transform) || this.startTimeUs != paster.startTimeUs || this.endTimeUs != paster.endTimeUs || !TextUtils.equals(this.resPath, paster.resPath) || !TextUtils.equals(this.path, paster.path) || this.mute != paster.mute) {
            z = false;
        } else {
            z = true;
        }
        if (this.type == 0) {
            return z;
        }
        if (z && TextUtils.equals(this.text, paster.text) && this.textColor == paster.textColor && this.outlineColor == paster.outlineColor && this.shadowColor == paster.shadowColor && TextUtils.equals(this.textFontPath, paster.textFontPath) && this.pasterChildNodes == paster.pasterChildNodes) {
            return true;
        }
        return false;
    }

    public boolean isTextStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd2a1605", new Object[]{this})).booleanValue();
        }
        int i = this.type;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isTextTemplateStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa5679ab", new Object[]{this})).booleanValue();
        }
        if (this.type == 3) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Paster{type=" + this.type + ", resType=" + this.resType + ", path='" + this.path + "', resPath='" + this.resPath + "', transform=" + this.transform + ", materialId=" + this.materialId + ", text='" + this.text + "', textColor=" + this.textColor + ", outlineColor=" + this.outlineColor + ", shadowColor=" + this.shadowColor + ", textFontPath='" + this.textFontPath + "', startTimeUs=" + this.startTimeUs + ", endTimeUs=" + this.endTimeUs + ", itemImageUrl='" + this.itemImageUrl + "', itemImageLocalPath='" + this.itemImageLocalPath + "', itemImageType=" + this.itemImageType + ", item=" + this.item + ", musicId='" + this.musicId + "', audioId='" + this.audioId + "', musicVendorType=" + this.musicVendorType + ", mute=" + this.mute + ", isAlgo=" + this.isAlgo + ", mark=" + this.mark + '}';
    }

    public boolean hasFlag(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63211dfa", new Object[]{this, new Integer(i)})).booleanValue() : hasFlag(this.mark, i);
    }
}
