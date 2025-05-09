package com.taobao.android.mnncv.mtop;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.mtop.MRTConfigRequest;
import com.taobao.mrt.task.MRTRuntimeException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements MRTConfigRequest.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MRTConfigRequest.c f8995a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.mnncv.mtop.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AsyncTaskC0467a extends AsyncTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MRTRuntimeException f8996a;
        public final /* synthetic */ String b;

        public AsyncTaskC0467a(MRTRuntimeException mRTRuntimeException, String str) {
            this.f8996a = mRTRuntimeException;
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(AsyncTaskC0467a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mnncv/mtop/MRTAsyncResponseCallback$1");
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr});
            }
            if (a.b(a.this) == null) {
                return null;
            }
            a.b(a.this).a(this.f8996a, this.b);
            return null;
        }
    }

    public a(MRTConfigRequest.c cVar) {
        this.f8995a = cVar;
    }

    public static /* synthetic */ MRTConfigRequest.c b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTConfigRequest.c) ipChange.ipc$dispatch("1225a783", new Object[]{aVar});
        }
        return aVar.f8995a;
    }

    @Override // com.taobao.android.mnncv.mtop.MRTConfigRequest.c
    public void a(MRTRuntimeException mRTRuntimeException, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64f9ad9", new Object[]{this, mRTRuntimeException, str});
        } else {
            new AsyncTaskC0467a(mRTRuntimeException, str).execute(new Object[0]);
        }
    }
}
