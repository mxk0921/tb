package com.taobao.android.shop.features.category.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.features.category.CategoryData;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DataUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ContainerType {
        ContainerType_Native,
        ContainerType_Weex;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ContainerType containerType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/features/category/data/DataUtil$ContainerType");
        }

        public static ContainerType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContainerType) ipChange.ipc$dispatch("d6347bc7", new Object[]{str});
            }
            return (ContainerType) Enum.valueOf(ContainerType.class, str);
        }
    }

    static {
        t2o.a(764411984);
    }

    public static ContainerType a(CategoryData categoryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerType) ipChange.ipc$dispatch("aa8c02fc", new Object[]{categoryData});
        }
        ContainerType containerType = ContainerType.ContainerType_Native;
        if (categoryData == null) {
            return containerType;
        }
        String str = categoryData.type;
        return (TextUtils.isEmpty(str) || str.equals("native") || !str.equals("weex")) ? containerType : ContainerType.ContainerType_Weex;
    }
}
