package com.taobao.taobao.scancode.huoyan.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopHeaderEvent;
import mtopsdk.mtop.common.MtopProgressEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopConvert;
import tb.rso;
import tb.t2o;
import tb.y7b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class KakaLibMTopParserHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "KakaLibMTopParserHelper";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class CustomAsyncDataListener<T> implements MtopCallback.MtopProgressListener, MtopCallback.MtopFinishListener, MtopCallback.MtopHeaderListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private y7b<T> requestCallback;
        private Class<T> responseClazz;

        static {
            t2o.a(760217773);
            t2o.a(589299883);
            t2o.a(589299881);
            t2o.a(589299882);
        }

        public CustomAsyncDataListener(Class<T> cls, y7b<T> y7bVar) {
            this.requestCallback = y7bVar;
            this.responseClazz = cls;
        }

        @Override // mtopsdk.mtop.common.MtopCallback.MtopProgressListener
        public void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ea8f321", new Object[]{this, mtopProgressEvent, obj});
                return;
            }
            y7b<T> y7bVar = this.requestCallback;
            if (y7bVar != null) {
                y7bVar.c(mtopProgressEvent.getDesc(), mtopProgressEvent.getSize(), mtopProgressEvent.getTotal());
            }
        }

        @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
        public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
            y7b<T> y7bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
                return;
            }
            MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
            if (mtopResponse != null && mtopResponse.isApiSuccess()) {
                try {
                    BaseOutDo mtopResponseToOutputDO = MtopConvert.mtopResponseToOutputDO(mtopResponse, this.responseClazz);
                    if (mtopResponseToOutputDO == null || (y7bVar = this.requestCallback) == null) {
                        y7b<T> y7bVar2 = this.requestCallback;
                        if (y7bVar2 != null) {
                            y7bVar2.b(new KakaLibMTopRequestException("error", "The reponse data is null"));
                            return;
                        }
                        return;
                    }
                    y7bVar.a(mtopResponseToOutputDO, null);
                } catch (ClassCastException e) {
                    this.requestCallback.b(e);
                }
            } else if (mtopResponse == null) {
                this.requestCallback.b(new KakaLibMTopRequestException("error", "The response is null"));
            } else {
                KakaLibMTopRequestException kakaLibMTopRequestException = new KakaLibMTopRequestException(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                this.requestCallback.b(kakaLibMTopRequestException);
                throw kakaLibMTopRequestException;
            }
        }

        @Override // mtopsdk.mtop.common.MtopCallback.MtopHeaderListener
        public void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34d28e9f", new Object[]{this, mtopHeaderEvent, obj});
            }
        }
    }

    static {
        t2o.a(760217772);
    }

    public static MtopBuilder a(Context context, IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("bee7f32a", new Object[]{context, iMTOPDataObject});
        }
        if (!rso.c()) {
            return Mtop.instance(context).build(iMTOPDataObject, TaoHelper.getTTID());
        }
        Mtop instance = Mtop.instance(Mtop.Id.INNER, context);
        MtopConfig mtopConfig = instance.getMtopConfig();
        if (mtopConfig != null) {
            return instance.build(iMTOPDataObject, mtopConfig.ttid);
        }
        return Mtop.instance(context).build(iMTOPDataObject, TaoHelper.getTTID());
    }

    public static <T> ApiID b(Context context, IMTOPDataObject iMTOPDataObject, Class<T> cls, y7b<T> y7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("2991fe66", new Object[]{context, iMTOPDataObject, cls, y7bVar});
        }
        MtopBuilder a2 = a(context, iMTOPDataObject);
        a2.addListener(new CustomAsyncDataListener(cls, y7bVar));
        Versions.isDebug();
        return a2.asyncRequest();
    }
}
