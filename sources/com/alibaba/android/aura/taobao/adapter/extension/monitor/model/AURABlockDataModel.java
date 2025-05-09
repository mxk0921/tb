package com.alibaba.android.aura.taobao.adapter.extension.monitor.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURABlockDataModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mLinkId;
    private final List<AURASliceDataModel> mSliceDataList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class AURASliceDataModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String mData;
        private final String mSliceLinkId;
        private final String mSliceNum;

        static {
            t2o.a(81789173);
        }

        public AURASliceDataModel(String str, String str2, String str3) {
            this.mSliceLinkId = str;
            this.mSliceNum = str2;
            this.mData = str3;
        }

        public String getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
            }
            return this.mData;
        }

        public String getSliceLinkId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("14d039e8", new Object[]{this});
            }
            return this.mSliceLinkId;
        }

        public String getSliceNum() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("664e472f", new Object[]{this});
            }
            return this.mSliceNum;
        }
    }

    static {
        t2o.a(81789172);
    }

    public AURABlockDataModel(String str, List<AURASliceDataModel> list) {
        this.mLinkId = str;
        this.mSliceDataList = list;
    }

    public String getLinkId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fe322e", new Object[]{this});
        }
        return this.mLinkId;
    }

    public List<AURASliceDataModel> getSliceDataList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("80a4d0fc", new Object[]{this});
        }
        return this.mSliceDataList;
    }
}
