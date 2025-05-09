package com.taobao.mytaobao.basement;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import tb.okv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BasementExposureManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.OnScrollListener f11161a;
    public final MTPtrRecyclerView b;
    public final okv c;

    static {
        t2o.a(745537573);
    }

    public BasementExposureManager(MTPtrRecyclerView mTPtrRecyclerView, MTBBasementContainerView mTBBasementContainerView) {
        this.b = mTPtrRecyclerView;
        RecyclerView.OnScrollListener a2 = a(mTBBasementContainerView);
        this.f11161a = a2;
        mTPtrRecyclerView.addOnScrollListener(a2);
        okv okvVar = new okv(mTPtrRecyclerView, mTBBasementContainerView);
        this.c = okvVar;
        okvVar.a(true);
    }

    public final RecyclerView.OnScrollListener a(MTBBasementContainerView mTBBasementContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("c6bae33c", new Object[]{this, mTBBasementContainerView});
        }
        return new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.basement.BasementExposureManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/basement/BasementExposureManager$1");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    BasementExposureManager.this.c.a(true);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                BasementExposureManager.this.c.a(false);
            }
        };
    }

    public void b() {
        RecyclerView.OnScrollListener onScrollListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        MTPtrRecyclerView mTPtrRecyclerView = this.b;
        if (mTPtrRecyclerView != null && (onScrollListener = this.f11161a) != null) {
            mTPtrRecyclerView.removeOnScrollListener(onScrollListener);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc63af7", new Object[]{this, new Boolean(z)});
        } else {
            this.c.c(z);
        }
    }
}
