package com.taobao.tao.export.flickbtn;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.export.flickbtn.mtop.MtopTaobaoSharepasswordQueryEntryRequest;
import com.taobao.tao.export.flickbtn.mtop.MtopTaobaoSharepasswordQueryEntryResponse;
import com.taobao.tao.export.flickbtn.mtop.MtopTaobaoSharepasswordQueryEntryResponseData;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.utils.ShareMemoryCache;
import com.ut.share.utils.UIHandler;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.j8t;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DXFlickingSharePresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11955a;
    public MtopTaobaoSharepasswordQueryEntryResponseData b;
    public String c;
    public String d;
    public String e;
    public String f;
    public final FlickingShareButton g;

    static {
        t2o.a(666894395);
    }

    public DXFlickingSharePresenter(FlickingShareButton flickingShareButton) {
        this.g = flickingShareButton;
    }

    public static /* synthetic */ MtopTaobaoSharepasswordQueryEntryResponseData a(DXFlickingSharePresenter dXFlickingSharePresenter, MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoSharepasswordQueryEntryResponseData) ipChange.ipc$dispatch("fbb875b7", new Object[]{dXFlickingSharePresenter, mtopTaobaoSharepasswordQueryEntryResponseData});
        }
        dXFlickingSharePresenter.b = mtopTaobaoSharepasswordQueryEntryResponseData;
        return mtopTaobaoSharepasswordQueryEntryResponseData;
    }

    public static /* synthetic */ FlickingShareButton b(DXFlickingSharePresenter dXFlickingSharePresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlickingShareButton) ipChange.ipc$dispatch("4ceafd9c", new Object[]{dXFlickingSharePresenter});
        }
        return dXFlickingSharePresenter.g;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ad00d3", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.c) && this.b != null) {
            HashMap hashMap = new HashMap();
            String shareIconType = this.b.getShareIconType();
            if (!TextUtils.isEmpty(shareIconType)) {
                hashMap.put("shareIconType", shareIconType);
            }
            String shareChannel = this.b.getShareChannel();
            if (!TextUtils.isEmpty(shareChannel)) {
                hashMap.put("shareChannel", shareChannel);
            }
            String shareUid = this.b.getShareUid();
            if (!TextUtils.isEmpty(shareUid)) {
                hashMap.put("shareUid", shareUid);
            }
            ShareMemoryCache.put(this.c, hashMap, 1000L);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe367e7", new Object[]{this});
        } else if (e()) {
            this.f11955a = true;
            MtopTaobaoSharepasswordQueryEntryRequest mtopTaobaoSharepasswordQueryEntryRequest = new MtopTaobaoSharepasswordQueryEntryRequest();
            mtopTaobaoSharepasswordQueryEntryRequest.setBizcode(this.c);
            mtopTaobaoSharepasswordQueryEntryRequest.setTargetType(this.f);
            mtopTaobaoSharepasswordQueryEntryRequest.setId(this.e);
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoSharepasswordQueryEntryRequest, j8t.a());
            build.registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.export.flickbtn.DXFlickingSharePresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.tao.export.flickbtn.DXFlickingSharePresenter$1$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
                public class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ MtopTaobaoSharepasswordQueryEntryResponseData f11956a;

                    public a(MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData) {
                        this.f11956a = mtopTaobaoSharepasswordQueryEntryResponseData;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData = this.f11956a;
                        if (mtopTaobaoSharepasswordQueryEntryResponseData != null && !TextUtils.equals(mtopTaobaoSharepasswordQueryEntryResponseData.getShareIconType(), "commonIconType")) {
                            DXFlickingSharePresenter.b(DXFlickingSharePresenter.this).setCustomImageAndPlayAnim(this.f11956a.getIcon());
                        }
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        DXFlickingSharePresenter.this.h();
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        MtopTaobaoSharepasswordQueryEntryResponseData data = ((MtopTaobaoSharepasswordQueryEntryResponse) baseOutDo).getData();
                        DXFlickingSharePresenter.a(DXFlickingSharePresenter.this, data);
                        UIHandler.runMain(new a(data));
                        DXFlickingSharePresenter.this.h();
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        DXFlickingSharePresenter.this.h();
                    }
                }
            });
            build.startRequest(MtopTaobaoSharepasswordQueryEntryResponse.class);
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27d235e6", new Object[]{this})).booleanValue();
        }
        if (!f() && !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(this.e) && !this.f11955a) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a6c976", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "downgradeShareBtnAni", "false"));
    }

    public void g() {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99150a9", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.c)) {
            MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData = this.b;
            if (mtopTaobaoSharepasswordQueryEntryResponseData == null) {
                map = null;
            } else {
                map = mtopTaobaoSharepasswordQueryEntryResponseData.getExtendMap();
            }
            ShareBusiness.traceShareBtnClick(this.c, this.d, map);
        }
    }

    public void h() {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a527de4f", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.c)) {
            MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData = this.b;
            if (mtopTaobaoSharepasswordQueryEntryResponseData == null) {
                map = null;
            } else {
                map = mtopTaobaoSharepasswordQueryEntryResponseData.getExtendMap();
            }
            ShareBusiness.traceShareBtnExpose(this.c, this.d, map);
        }
    }
}
