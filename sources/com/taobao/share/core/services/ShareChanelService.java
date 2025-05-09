package com.taobao.share.core.services;

import android.os.RemoteException;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.service.AidlService;
import com.taobao.share.aidl.IShareSupplyChannel;
import com.taobao.share.aidl.IShareSupplyChannelCallBack;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.TaobaoApplication;
import java.util.ArrayList;
import java.util.Iterator;
import tb.t2o;
import tb.vi3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareChanelService extends AidlService<IShareSupplyChannel, ShareChanelServiceBinder> {
    public static final String TAG = "ShareChanelService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ShareChanelServiceBinder extends IShareSupplyChannel.Stub {
        static {
            t2o.a(664797250);
        }

        public ShareChanelServiceBinder() {
        }

        @Override // com.taobao.share.aidl.IShareSupplyChannel
        public void supplyChannel(IShareSupplyChannelCallBack iShareSupplyChannelCallBack) throws RemoteException {
            if (ShareBizAdapter.getInstance().getShareEngine() != null && ShareBizAdapter.getInstance().getShareEngine().getChanelEngine() != null) {
                ArrayList<vi3> b = ShareBizAdapter.getInstance().getShareEngine().getChanelEngine().b(false);
                ArrayList arrayList = new ArrayList();
                if (b != null && b.size() > 0) {
                    Iterator<vi3> it = b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().k());
                    }
                }
                if (iShareSupplyChannelCallBack != null) {
                    iShareSupplyChannelCallBack.channelCallBack(arrayList);
                }
            }
        }
    }

    static {
        t2o.a(664797249);
    }

    public ShareChanelService() {
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }
}
