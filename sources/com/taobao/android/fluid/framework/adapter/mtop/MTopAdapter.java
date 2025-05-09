package com.taobao.android.fluid.framework.adapter.mtop;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.a;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.IRemoteParserListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.akt;
import tb.ir9;
import tb.jrf;
import tb.sz3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MTopAdapter implements IMTopAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_GROUP = "ShortVideo";
    private static final String ORANGE_KEY_DEGRADE_MTOP_ALLOW_SWITCH_TO_POST = "degradeMtopAllowSwitchToPOST";
    private static final String TAG = "MTopAdapter";
    public final Context mContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class ParserResponseCallback implements IRemoteBaseListener, IRemoteParserListener {
        static {
            t2o.a(468713837);
            t2o.a(589299719);
            t2o.a(589299722);
        }
    }

    static {
        t2o.a(468713833);
        t2o.a(468713811);
    }

    public MTopAdapter(Context context) {
        this.mContext = context;
    }

    private static boolean degradeMtopAllowSwitchToPOST() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08fb425", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", ORANGE_KEY_DEGRADE_MTOP_ALLOW_SWITCH_TO_POST, "false"));
        } catch (Throwable th) {
            TLog.loge(TAG, "degradeMtopAllowSwitchToPOST error", th);
            return false;
        }
    }

    private boolean enableSendHeadersRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18bb373f", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableSendHeadersRequest", true);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return IMTopAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public long getServerTimeMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b67da507", new Object[]{this})).longValue();
        }
        return TimestampSynchronizer.getServerTime();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public final <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, IMTopAdapter.b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb572b60", new Object[]{this, iMTOPDataObject, bVar});
        } else {
            send(iMTOPDataObject, bVar, null, null);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void sendWithPrefetch(JSONObject jSONObject, IMTopAdapter.b<T> bVar, IMTopAdapter.a<T> aVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d7a1aff", new Object[]{this, jSONObject, bVar, aVar, cls});
        } else {
            sendWithPrefetchFromLauncher(jSONObject, bVar, aVar, cls, false);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void sendWithPrefetchFromLauncher(JSONObject jSONObject, IMTopAdapter.b<T> bVar, IMTopAdapter.a<T> aVar, Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc386eb", new Object[]{this, jSONObject, bVar, aVar, cls, new Boolean(z)});
        } else {
            sendWithPrefetch(a.b.m().t(jSONObject).k(bVar).r(aVar).l(cls).o(z).j());
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public final <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, jrf<T> jrfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80109da", new Object[]{this, iMTOPDataObject, jrfVar});
        } else {
            send(iMTOPDataObject, jrfVar, null, null);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void sendWithPrefetch(a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb2b40f", new Object[]{this, aVar});
        } else if (aVar != null) {
            JSONObject jSONObject = aVar.b;
            final IMTopAdapter.b<T> bVar = aVar.c;
            final IMTopAdapter.a<T> aVar2 = aVar.d;
            final Class<T> cls = aVar.e;
            ParserResponseCallback parserResponseCallback = new ParserResponseCallback() { // from class: com.taobao.android.fluid.framework.adapter.mtop.MTopAdapter.3
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private volatile CommonResponseOutDo data;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/adapter/mtop/MTopAdapter$3");
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        bVar.onError(mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (this.data == null) {
                        bVar.a(mtopResponse, null);
                    } else {
                        bVar.a(mtopResponse, this.data);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        bVar.onError(mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
                public void parseResponse(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
                        return;
                    }
                    try {
                        this.data = (CommonResponseOutDo) aVar2.a(mtopResponse.getBytedata(), cls);
                    } catch (Exception e) {
                        ir9.c(MTopAdapter.TAG, "sendWithPrefetch parseResponse error", e);
                    }
                }
            };
            MtopModule.requestWithParserInner(new d.j(null, jSONObject, null), parserResponseCallback, parserResponseCallback, aVar.f, aVar.i);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public final <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, IMTopAdapter.b<T> bVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f7657dd", new Object[]{this, iMTOPDataObject, bVar, cls});
        } else {
            send(iMTOPDataObject, bVar, null, cls);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, IMTopAdapter.b<T> bVar, IMTopAdapter.a<T> aVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfe558a", new Object[]{this, iMTOPDataObject, bVar, aVar, cls});
        } else {
            send(a.b.m().s(iMTOPDataObject).k(bVar).r(aVar).l(cls).j());
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void send(a<T> aVar) {
        IRemoteListener iRemoteListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4906312", new Object[]{this, aVar});
        } else if (aVar != null) {
            IMTOPDataObject iMTOPDataObject = aVar.f7765a;
            final IMTopAdapter.b<T> bVar = aVar.c;
            final IMTopAdapter.a<T> aVar2 = aVar.d;
            final Class<T> cls = aVar.e;
            Context context = this.mContext;
            if (context == null) {
                bVar.onError(null);
                return;
            }
            if (aVar2 != null) {
                iRemoteListener = new ParserResponseCallback() { // from class: com.taobao.android.fluid.framework.adapter.mtop.MTopAdapter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    private volatile CommonResponseOutDo data;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/adapter/mtop/MTopAdapter$1");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            bVar.onError(mtopResponse);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else if (this.data == null) {
                            bVar.a(mtopResponse, null);
                        } else {
                            bVar.a(mtopResponse, this.data);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            bVar.onError(mtopResponse);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
                    public void parseResponse(MtopResponse mtopResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
                            return;
                        }
                        try {
                            this.data = (CommonResponseOutDo) aVar2.a(mtopResponse.getBytedata(), cls);
                        } catch (Exception e) {
                            ir9.c(MTopAdapter.TAG, "parseResponse error", e);
                        }
                    }
                };
            } else {
                iRemoteListener = new IRemoteBaseListener() { // from class: com.taobao.android.fluid.framework.adapter.mtop.MTopAdapter.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            bVar.onError(mtopResponse);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else if (baseOutDo == null) {
                            bVar.a(mtopResponse, null);
                        } else {
                            bVar.a(mtopResponse, (CommonResponseOutDo) baseOutDo);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            bVar.onError(mtopResponse);
                        }
                    }
                };
            }
            MtopBusiness registerListener = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), iMTOPDataObject).registerListener(iRemoteListener);
            if (aVar.g) {
                registerListener.reqMethod(MethodEnum.POST);
            } else if (!degradeMtopAllowSwitchToPOST()) {
                registerListener.allowSwitchToPOST(true);
            }
            if (enableSendHeadersRequest() && !sz3.b(aVar.h)) {
                ir9.b(TAG, "send 请求 headers不为null");
                registerListener.headers(aVar.h);
            }
            if (cls == null || aVar2 != null) {
                registerListener.startRequest();
            } else {
                registerListener.startRequest(cls);
            }
            MtopModule.c cVar = aVar.f;
            if (cVar != null) {
                cVar.a(registerListener);
            }
        }
    }
}
