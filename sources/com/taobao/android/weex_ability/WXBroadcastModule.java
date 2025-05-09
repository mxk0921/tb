package com.taobao.android.weex_ability;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.module.WeexInnerModule;
import java.util.HashMap;
import java.util.Map;
import tb.f4x;
import tb.fmi;
import tb.mmi;
import tb.t2o;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WXBroadcastModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CHANNEL_INSTANCE_ID = "instanceId";
    private static final String CHANNEL_KEY = "name";
    private static final String CHANNEL_MESSAGE = "message";
    private static final String MESSAGE = "message";
    public static final String[] METHODS = {"createChannel", xpd.c.EVENT_ON_MESSAGE, "postMessage", "closeChannel", "close"};
    public static final String NAME = "broadcast";
    private static final String RESULT = "result";
    private Map<String, mmi> messageTokenChannels = new HashMap();

    private void close(JSONObject jSONObject) {
        mmi remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d1a051", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.messageTokenChannels != null && jSONObject.containsKey("instanceId") && (remove = this.messageTokenChannels.remove(jSONObject.getString("instanceId"))) != null) {
            remove.a();
        }
    }

    private void closeChannel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39dba3e", new Object[]{this, jSONObject});
        } else {
            close(jSONObject);
        }
    }

    public static /* synthetic */ Object ipc$super(WXBroadcastModule wXBroadcastModule, String str, Object... objArr) {
        if (str.hashCode() == -498459201) {
            super.onMainThreadDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXBroadcastModule");
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        Map<String, mmi> map = this.messageTokenChannels;
        if (map != null) {
            for (Map.Entry<String, mmi> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().a();
                }
            }
            this.messageTokenChannels.clear();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9934a;

        public a(WXBroadcastModule wXBroadcastModule, f4x f4xVar) {
            this.f9934a = f4xVar;
        }

        @Override // tb.fmi
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            } else if (this.f9934a != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", (Object) "0");
                jSONObject.put("message", obj);
                this.f9934a.a(obj);
            }
        }
    }

    private void createChannel(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded19c9e", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else if (getWeexInstance().getContext() == null || jSONObject == null || TextUtils.isEmpty(jSONObject.getString("name")) || TextUtils.isEmpty(jSONObject.getString("instanceId"))) {
            if (f4xVar2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", (Object) "-1");
                jSONObject2.put("message", (Object) "channel args error");
                f4xVar2.b(jSONObject2);
            }
            if (f4xVar != null) {
                f4xVar.release();
            }
        } else {
            synchronized (this) {
                try {
                    if (this.messageTokenChannels == null) {
                        this.messageTokenChannels = new HashMap();
                    }
                    String string = jSONObject.getString("name");
                    String string2 = jSONObject.getString("instanceId");
                    if (this.messageTokenChannels.get(string2) != null) {
                        if (f4xVar2 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("result", (Object) "-1");
                            jSONObject3.put("message", (Object) "channel error token has been used");
                            f4xVar2.b(jSONObject3);
                        }
                        if (f4xVar != null) {
                            f4xVar.release();
                        }
                        return;
                    }
                    this.messageTokenChannels.put(string2, new mmi(getWeexInstance().getContext(), string, null));
                    if (f4xVar != null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("result", (Object) "0");
                        jSONObject4.put("message", (Object) "channel create success");
                        f4xVar.b(jSONObject4);
                    }
                    if (f4xVar2 != null) {
                        f4xVar2.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void onMessage(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bcb01fd", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else if (this.messageTokenChannels != null) {
            String string = jSONObject.getString("instanceId");
            if (TextUtils.isEmpty(string)) {
                if (f4xVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", (Object) "-1");
                    jSONObject2.put("message", (Object) "channel token empty error");
                    f4xVar2.b(jSONObject2);
                }
                if (f4xVar != null) {
                    f4xVar.release();
                    return;
                }
                return;
            }
            mmi mmiVar = this.messageTokenChannels.get(string);
            if (mmiVar == null) {
                if (f4xVar2 != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("result", (Object) "-1");
                    jSONObject3.put("message", (Object) "channel token not exist");
                    f4xVar2.b(jSONObject3);
                }
                if (f4xVar != null) {
                    f4xVar.release();
                    return;
                }
                return;
            }
            if (f4xVar2 != null) {
                f4xVar2.release();
            }
            mmiVar.e(new a(this, f4xVar));
        }
    }

    private void postMessage(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab5cdbe", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else if (this.messageTokenChannels != null) {
            if (TextUtils.isEmpty(jSONObject.getString("instanceId")) || !jSONObject.containsKey("message")) {
                if (f4xVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", (Object) "-1");
                    jSONObject2.put("message", (Object) "post message args error");
                    f4xVar2.b(jSONObject2);
                }
                if (f4xVar != null) {
                    f4xVar.release();
                    return;
                }
                return;
            }
            String string = jSONObject.getString("instanceId");
            Object obj = jSONObject.get("message");
            mmi mmiVar = this.messageTokenChannels.get(string);
            if (mmiVar == null) {
                if (f4xVar2 != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("result", (Object) "-1");
                    jSONObject3.put("message", (Object) "channel token not exist");
                    f4xVar2.b(jSONObject3);
                }
                if (f4xVar != null) {
                    f4xVar.release();
                    return;
                }
                return;
            }
            mmiVar.d(obj);
            if (f4xVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", (Object) "0");
                jSONObject4.put("message", (Object) "post message success");
                f4xVar.b(jSONObject4);
            }
            if (f4xVar2 != null) {
                f4xVar2.release();
            }
        }
    }

    static {
        t2o.a(980418585);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r11.equals("postMessage") == false) goto L_0x002c;
     */
    @Override // com.taobao.android.weex.module.WeexInnerModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex.WeexValue callModuleMethod(com.taobao.android.weex.WeexInstanceImpl r9, java.lang.String r10, java.lang.String r11, com.taobao.android.weex.WeexValue[] r12) throws java.lang.Exception {
        /*
            r8 = this;
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.weex_ability.WXBroadcastModule.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0021
            java.lang.String r6 = "ffafd8f7"
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r8
            r7[r3] = r9
            r7[r2] = r10
            r7[r1] = r11
            r7[r0] = r12
            java.lang.Object r9 = r5.ipc$dispatch(r6, r7)
            com.taobao.android.weex.WeexValue r9 = (com.taobao.android.weex.WeexValue) r9
            return r9
        L_0x0021:
            r11.hashCode()
            r9 = -1
            int r10 = r11.hashCode()
            switch(r10) {
                case -2003762904: goto L_0x0059;
                case -1309499289: goto L_0x004e;
                case -606138389: goto L_0x0043;
                case 94756344: goto L_0x0038;
                case 1490029383: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x0064
        L_0x002e:
            java.lang.String r10 = "postMessage"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0064
            goto L_0x002c
        L_0x0038:
            java.lang.String r10 = "close"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0041
            goto L_0x002c
        L_0x0041:
            r0 = 3
            goto L_0x0064
        L_0x0043:
            java.lang.String r10 = "closeChannel"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x004c
            goto L_0x002c
        L_0x004c:
            r0 = 2
            goto L_0x0064
        L_0x004e:
            java.lang.String r10 = "createChannel"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0057
            goto L_0x002c
        L_0x0057:
            r0 = 1
            goto L_0x0064
        L_0x0059:
            java.lang.String r10 = "onMessage"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0063
            goto L_0x002c
        L_0x0063:
            r0 = 0
        L_0x0064:
            switch(r0) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x009d;
                case 2: goto L_0x008e;
                case 3: goto L_0x007f;
                case 4: goto L_0x0068;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x00ca
        L_0x0068:
            r8.argCount(r12, r1)
            com.taobao.android.weex.WeexValue r9 = r8.getArg(r12, r4)
            com.alibaba.fastjson.JSONObject r9 = r9.toJSONObjectOrNull()
            tb.f4x r10 = r8.getCallback(r12, r3)
            tb.f4x r11 = r8.getCallback(r12, r2)
            r8.postMessage(r9, r10, r11)
            goto L_0x00ca
        L_0x007f:
            r8.argCount(r12, r3)
            com.taobao.android.weex.WeexValue r9 = r8.getArg(r12, r4)
            com.alibaba.fastjson.JSONObject r9 = r9.toJSONObjectOrNull()
            r8.close(r9)
            goto L_0x00ca
        L_0x008e:
            r8.argCount(r12, r3)
            com.taobao.android.weex.WeexValue r9 = r8.getArg(r12, r4)
            com.alibaba.fastjson.JSONObject r9 = r9.toJSONObjectOrNull()
            r8.closeChannel(r9)
            goto L_0x00ca
        L_0x009d:
            r8.argCount(r12, r1)
            com.taobao.android.weex.WeexValue r9 = r8.getArg(r12, r4)
            com.alibaba.fastjson.JSONObject r9 = r9.toJSONObjectOrNull()
            tb.f4x r10 = r8.getCallback(r12, r3)
            tb.f4x r11 = r8.getCallback(r12, r2)
            r8.createChannel(r9, r10, r11)
            goto L_0x00ca
        L_0x00b4:
            r8.argCount(r12, r1)
            com.taobao.android.weex.WeexValue r9 = r8.getArg(r12, r4)
            com.alibaba.fastjson.JSONObject r9 = r9.toJSONObjectOrNull()
            tb.f4x r10 = r8.getCallback(r12, r3)
            tb.f4x r11 = r8.getCallback(r12, r2)
            r8.onMessage(r9, r10, r11)
        L_0x00ca:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.WXBroadcastModule.callModuleMethod(com.taobao.android.weex.WeexInstanceImpl, java.lang.String, java.lang.String, com.taobao.android.weex.WeexValue[]):com.taobao.android.weex.WeexValue");
    }
}
