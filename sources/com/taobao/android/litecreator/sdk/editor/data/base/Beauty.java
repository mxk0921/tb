package com.taobao.android.litecreator.sdk.editor.data.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Beauty extends EditableBean<Beauty> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long BEAUTY_FLAG = 2;
    public static final String BEAUTY_SHAPE_KEY = "BeautyShape";
    public static final int DIRTY_TYPE_ALL = 3;
    public static final int DIRTY_TYPE_SINGE_BEAUTY = 1;
    public static final int DIRTY_TYPE_SINGLE_SHAPE = 2;
    public Map<Integer, Float> mBeautyValues;
    public String mDirPath;
    public int mDirtyType = 3;
    public boolean mEnable;
    public String mOutputUtParams;
    public Map<Integer, Float> mShapeValues;
    public int mSingleKey;

    static {
        t2o.a(511705453);
    }

    public static /* synthetic */ Object ipc$super(Beauty beauty, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/base/Beauty");
    }

    private void resetMap(Map<Integer, Float> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68c7171", new Object[]{this, map});
        } else if (map != null) {
            for (Integer num : map.keySet()) {
                map.put(num, Float.valueOf(0.0f));
            }
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        resetMap(this.mBeautyValues);
        resetMap(this.mShapeValues);
    }
}
