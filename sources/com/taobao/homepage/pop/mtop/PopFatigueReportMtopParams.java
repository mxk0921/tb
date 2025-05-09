package com.taobao.homepage.pop.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PopFatigueReportMtopParams implements IMTOPDataObject {
    public String businessId;
    public String passParam;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10597a;
        public String b;

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("90a1fc0", new Object[]{bVar});
            }
            return bVar.f10597a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f211e4c1", new Object[]{bVar});
            }
            return bVar.b;
        }

        public PopFatigueReportMtopParams c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PopFatigueReportMtopParams) ipChange.ipc$dispatch("bebf9353", new Object[]{this});
            }
            return new PopFatigueReportMtopParams(this);
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2527a599", new Object[]{this, str});
            }
            this.f10597a = str;
            return this;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9357f64e", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    private PopFatigueReportMtopParams(b bVar) {
        this.businessId = b.a(bVar);
        this.passParam = b.b(bVar);
    }
}
