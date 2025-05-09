package com.taobao.taobao.scancode.barcode.business;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.scancode.barcode.object.recommend.GetQRMedicineUrlRequest;
import com.taobao.taobao.scancode.barcode.object.recommend.GetQRMedicineUrlResponse;
import com.taobao.taobao.scancode.gateway.util.a;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ey3;
import tb.rso;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetQRMedicineUrlBussiness implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c handleMedicineListener;
    private String rowkey;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(760217618);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/barcode/business/GetQRMedicineUrlBussiness$GetMedicineUrlTask");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            GetQRMedicineUrlRequest getQRMedicineUrlRequest = new GetQRMedicineUrlRequest();
            getQRMedicineUrlRequest.rowkey = GetQRMedicineUrlBussiness.access$100(GetQRMedicineUrlBussiness.this);
            RemoteBusiness registeListener = RemoteBusiness.build(Globals.getApplication(), getQRMedicineUrlRequest, rso.o(Globals.getApplication())).registeListener((IRemoteListener) GetQRMedicineUrlBussiness.this);
            registeListener.useWua();
            registeListener.startRequest(0, GetQRMedicineUrlResponse.class);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    static {
        t2o.a(760217616);
        t2o.a(589299719);
    }

    public GetQRMedicineUrlBussiness() {
        this.rowkey = null;
    }

    public static /* synthetic */ String access$100(GetQRMedicineUrlBussiness getQRMedicineUrlBussiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3c5f47d", new Object[]{getQRMedicineUrlBussiness});
        }
        return getQRMedicineUrlBussiness.rowkey;
    }

    public void handleMedicine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08df409", new Object[]{this});
        } else if (this.handleMedicineListener != null) {
            if (!GetQRMedicineUrlRequest.isQRMedicneCode(this.rowkey)) {
                ((a.o) this.handleMedicineListener).a();
                return;
            }
            new b().execute(new Void[0]);
            ey3.g().h("Medicine_REQ_QR_handleMedicine");
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            ((a.o) this.handleMedicineListener).a();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (baseOutDo == null) {
            ((a.o) this.handleMedicineListener).a();
        } else {
            GetQRMedicineUrlResponse getQRMedicineUrlResponse = (GetQRMedicineUrlResponse) baseOutDo;
            if (getQRMedicineUrlResponse.getData() == null) {
                ((a.o) this.handleMedicineListener).a();
            } else {
                ((a.o) this.handleMedicineListener).b(getQRMedicineUrlResponse.getData().getResult());
            }
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            ((a.o) this.handleMedicineListener).a();
        }
    }

    public GetQRMedicineUrlBussiness(c cVar, String str) {
        this.handleMedicineListener = cVar;
        this.rowkey = str;
    }
}
