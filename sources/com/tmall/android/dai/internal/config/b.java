package com.tmall.android.dai.internal.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.tmall.android.dai.internal.config.Config;
import tb.h45;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944638);
    }

    public static MRTFilesDescription a(h45 h45Var, MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTFilesDescription) ipChange.ipc$dispatch("7406c3a2", new Object[]{h45Var, mRTTaskDescription});
        }
        if (h45Var.i() == null) {
            return null;
        }
        Config.ModelResource i = h45Var.i();
        return new MRTFilesDescription(i.files, i.fileUrl, i.fileMd5, mRTTaskDescription);
    }

    public static MRTTaskDescription b(h45 h45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTTaskDescription) ipChange.ipc$dispatch("95b5a023", new Object[]{h45Var});
        }
        if (h45Var == null) {
            return null;
        }
        MRTTaskDescription mRTTaskDescription = new MRTTaskDescription();
        mRTTaskDescription.async = false;
        mRTTaskDescription.name = h45Var.h();
        mRTTaskDescription.clnName = h45Var.c();
        mRTTaskDescription.model = new MRTCodeDescription(h45Var.g(), h45Var.f(), null, mRTTaskDescription);
        mRTTaskDescription.resource = a(h45Var, mRTTaskDescription);
        mRTTaskDescription.cid = h45Var.b();
        mRTTaskDescription.extentAgr1 = h45Var.d();
        return mRTTaskDescription;
    }
}
