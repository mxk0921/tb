package com.taobao.dojo.ability.messiah.impl.foundation;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.dojo.ability.messiah.mtop.StabilityDataUploadMtopParams;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.e9u;
import tb.ebl;
import tb.eet;
import tb.sdh;
import tb.t2o;
import tb.tvk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DataUploader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10384a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f10385a;
        public final /* synthetic */ e9u b;
        public final /* synthetic */ tvk c;

        public a(List list, e9u e9uVar, tvk tvkVar) {
            this.f10385a = list;
            this.b = e9uVar;
            this.c = tvkVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) DataUploader.a(DataUploader.this, this.f10385a));
            IRemoteBaseListener b = DataUploader.b(DataUploader.this, this.b, this.c);
            build.reqMethod(MethodEnum.POST);
            build.registeListener((IRemoteListener) b);
            build.startRequest();
        }
    }

    static {
        t2o.a(447741961);
    }

    public static /* synthetic */ StabilityDataUploadMtopParams a(DataUploader dataUploader, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StabilityDataUploadMtopParams) ipChange.ipc$dispatch("6af9c538", new Object[]{dataUploader, list});
        }
        return dataUploader.d(list);
    }

    public static /* synthetic */ IRemoteBaseListener b(DataUploader dataUploader, e9u e9uVar, tvk tvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteBaseListener) ipChange.ipc$dispatch("77b03f87", new Object[]{dataUploader, e9uVar, tvkVar});
        }
        return dataUploader.e(e9uVar, tvkVar);
    }

    public final void c(e9u e9uVar, List<TbHRLogModel> list, tvk tvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99525a79", new Object[]{this, e9uVar, list, tvkVar});
        } else {
            eet.a().d(new a(list, e9uVar, tvkVar));
        }
    }

    public final IRemoteBaseListener e(final e9u e9uVar, final tvk tvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteBaseListener) ipChange.ipc$dispatch("90c27993", new Object[]{this, e9uVar, tvkVar});
        }
        return new IRemoteBaseListener() { // from class: com.taobao.dojo.ability.messiah.impl.foundation.DataUploader.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                tvkVar.b(e9uVar);
                sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "Uploader上报失败");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    tvkVar.a(e9uVar);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                tvkVar.b(e9uVar);
                sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "Uploader数据系统上报失败");
            }
        };
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.f10384a)) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "Uploader,mChannelHandleAppId" + this.f10384a);
            return this.f10384a;
        }
        String b = ebl.b("channelHandleAppID", "36301");
        this.f10384a = b;
        if (TextUtils.isEmpty(b)) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "UploadermChannelHandleAppId == null");
            return "36301";
        }
        sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "Uploader,mChannelHandleAppId2: " + this.f10384a);
        return this.f10384a;
    }

    public void g(e9u e9uVar, List<TbHRLogModel> list, tvk tvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b59638a", new Object[]{this, e9uVar, list, tvkVar});
            return;
        }
        try {
            c(e9uVar, list, tvkVar);
        } catch (Exception e) {
            sdh.a(ModuleName.CLIENT_TO_SERVICE_MONITOR, "requestError", "uploadData occur Exception" + e);
        }
    }

    public final StabilityDataUploadMtopParams d(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StabilityDataUploadMtopParams) ipChange.ipc$dispatch("7ed66935", new Object[]{this, list});
        }
        StabilityDataUploadMtopParams stabilityDataUploadMtopParams = new StabilityDataUploadMtopParams();
        HashMap hashMap = new HashMap();
        hashMap.put("hsrRequestResource", "homePageClient");
        String str = "";
        try {
            str = JSON.toJSONString(list, SerializerFeature.DisableCircularReferenceDetect);
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "Uploader,构建参数" + str);
        } catch (Exception e) {
            sdh.a(ModuleName.CLIENT_TO_SERVICE_MONITOR, "parseDataException", "constructUploadMtopParamsBuilder occur Exception: " + e);
        }
        hashMap.put("tbHRLog", str);
        stabilityDataUploadMtopParams.appId = f();
        stabilityDataUploadMtopParams.params = JSON.toJSONString(hashMap);
        return stabilityDataUploadMtopParams;
    }
}
