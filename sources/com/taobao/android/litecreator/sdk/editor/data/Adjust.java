package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Adjust extends EditableBean<Adjust> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ADJUST_FLAG = 1;
    public static final int DIRTY_TYPE_ALL = 2;
    public static final int DIRTY_TYPE_SINGLE = 1;
    public static final String IMAGE_ADJUST_KEY = "colorAdjustment";
    public String mDirPath;
    public boolean mEnable;
    public Map<String, Float> mParamsValues;
    public int mDirtyType = 2;
    public String mSingleKey = "";
    public int mIndex = 0;

    static {
        t2o.a(511705418);
    }

    public static /* synthetic */ Object ipc$super(Adjust adjust, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/Adjust");
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        Map<String, Float> map = this.mParamsValues;
        if (map != null) {
            for (String str : map.keySet()) {
                this.mParamsValues.put(str, Float.valueOf(0.0f));
            }
        }
    }
}
