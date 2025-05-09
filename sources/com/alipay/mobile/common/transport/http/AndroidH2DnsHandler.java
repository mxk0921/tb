package com.alipay.mobile.common.transport.http;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AndroidH2DnsHandler implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AndroidH2DnsHandler b;
    public static final String[] c = {"resolveInetAddresses", "lookup"};
    public static final Class<?>[] d = {InetAddress[].class, List.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f4068a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class MethodDesc {
        public String dnsMethodName = null;
        public Class<?> dnsMethodReturnType = null;

        public MethodDesc() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class ResolveDnsResult {
        public Object addresses;
        public String dnsFrom = "";

        public ResolveDnsResult() {
        }
    }

    public static final AndroidH2DnsHandler getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidH2DnsHandler) ipChange.ipc$dispatch("e39af7bc", new Object[0]);
        }
        AndroidH2DnsHandler androidH2DnsHandler = b;
        if (androidH2DnsHandler != null) {
            return androidH2DnsHandler;
        }
        synchronized (AndroidH2DnsHandler.class) {
            try {
                AndroidH2DnsHandler androidH2DnsHandler2 = b;
                if (androidH2DnsHandler2 != null) {
                    return androidH2DnsHandler2;
                }
                AndroidH2DnsHandler androidH2DnsHandler3 = new AndroidH2DnsHandler();
                b = androidH2DnsHandler3;
                return androidH2DnsHandler3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ResolveDnsResult a(String str, MethodDesc methodDesc) {
        InetAddress[] inetAddressArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResolveDnsResult) ipChange.ipc$dispatch("d0f54f5c", new Object[]{this, str, methodDesc});
        }
        ResolveDnsResult resolveDnsResult = new ResolveDnsResult();
        AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
        if (dnsClient != null) {
            TransportContext value = TransportContextThreadLocalUtils.getValue();
            if (value != null) {
                inetAddressArr = dnsClient.getAllByName(str, value);
            } else {
                inetAddressArr = dnsClient.getAllByName(str);
            }
            if (inetAddressArr != null && inetAddressArr.length > 0) {
                resolveDnsResult.dnsFrom = "dnsClient";
                resolveDnsResult.addresses = c(inetAddressArr, methodDesc);
                return resolveDnsResult;
            }
        }
        resolveDnsResult.dnsFrom = RPCDataItems.VALUE_DT_LOCALDNS;
        resolveDnsResult.addresses = c(DnsUtil.getAllByName(str), methodDesc);
        return resolveDnsResult;
    }

    public final Object b(Method method, Object[] objArr) {
        if (this.f4068a != null) {
            String name = method.getName();
            String[] strArr = c;
            if (TextUtils.equals(name, strArr[0]) || TextUtils.equals(method.getName(), strArr[1])) {
                TransportContextThreadLocalUtils.addDnsType(RPCDataItems.VALUE_DT_LOCALDNS);
            }
            try {
                Object invoke = method.invoke(this.f4068a, objArr);
                StringBuilder sb = new StringBuilder("invokeFromRawObj execution finish. raw class = [" + this.f4068a.getClass().getName() + "], methodName=[" + method.getName() + "] ");
                if (invoke != null) {
                    sb.append(", value = [" + JSON.toJSONString(invoke) + "]");
                }
                LogCatUtil.printInfo("AndroidH2DnsHandler", sb.toString());
                return invoke;
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                LogCatUtil.error("AndroidH2DnsHandler", "[invokeFromRawObj] Exception = " + targetException.toString(), targetException);
                return null;
            } catch (Throwable th) {
                LogCatUtil.error("AndroidH2DnsHandler", "[invokeFromRawObj] Exception = " + th.toString(), th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("rawAndroidH2DnsHandler field is null, you must first call this 'setRawAndroidH2DnsHandler' to set the field");
        }
    }

    public final Object c(InetAddress[] inetAddressArr, MethodDesc methodDesc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("873eb9d7", new Object[]{this, inetAddressArr, methodDesc});
        }
        if (inetAddressArr == null) {
            throw new IllegalArgumentException("adapteReturnValue.  returnValue maybe null.");
        } else if (methodDesc.dnsMethodReturnType == inetAddressArr.getClass()) {
            return inetAddressArr;
        } else {
            List asList = Arrays.asList(inetAddressArr);
            LogCatUtil.info("AndroidH2DnsHandler", "adapteReturnValue. returnValue=[" + asList.toString() + "]");
            return asList;
        }
    }

    public final boolean e(long j, int i, Throwable th, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df87dd99", new Object[]{this, new Long(j), new Integer(i), th, new Integer(i2)})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < 0 || currentTimeMillis > 12000) {
            LogCatUtil.warn("AndroidH2DnsHandler", "[isCanRetryDns] Can not redns， dnsCost = " + currentTimeMillis + ",  Exception: " + th.toString());
            return false;
        } else if (i >= i2) {
            LogCatUtil.warn("AndroidH2DnsHandler", "[isCanRetryDns] Can not redns. retryCount = " + i + ", Exception: " + th.toString());
            return false;
        } else {
            LogCatUtil.debug("AndroidH2DnsHandler", "[isCanRetryDns] Will sleep 1s.");
            try {
                Thread.sleep(1000L);
                LogCatUtil.warn("AndroidH2DnsHandler", "[isCanRetryDns] Can redns. Exception: " + th.toString());
                return true;
            } catch (Throwable th2) {
                LogCatUtil.warn("AndroidH2DnsHandler", "[isCanRetryDns] sleep exception = " + th2.toString());
                return false;
            }
        }
    }

    public void setRawAndroidH2DnsHandler(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d0e5b7", new Object[]{this, obj});
        } else {
            this.f4068a = obj;
        }
    }

    public final void d(Object obj, String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7b7558", new Object[]{this, obj, str, str2});
            return;
        }
        try {
            if (obj == null) {
                LogCatUtil.info("AndroidH2DnsHandler", "printLog. DNS resolution failed. hostName = " + str);
                return;
            }
            String str3 = "";
            if (obj.getClass() == InetAddress[].class) {
                InetAddress[] inetAddressArr = (InetAddress[]) obj;
                str3 = Arrays.toString(inetAddressArr);
                i = inetAddressArr.length;
            } else if (List.class.isAssignableFrom(obj.getClass())) {
                List list = (List) obj;
                str3 = list.toString();
                i = list.size();
            } else {
                LogCatUtil.warn("AndroidH2DnsHandler", "printLog. Unknown address object type it's = ".concat(obj.getClass().getName()));
            }
            LogCatUtil.info("AndroidH2DnsHandler", "printLog. DNS resolution is complete. dnsFrom = " + str2 + ", hostName = " + str + ", addresses len = " + i + ",ips = [" + str3 + "]");
        } catch (Throwable th) {
            LogCatUtil.warn("AndroidH2DnsHandler", "printLog. finally process exception ", th);
        }
    }

    public final boolean f(Method method, Object[] objArr, MethodDesc methodDesc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a316ee65", new Object[]{this, method, objArr, methodDesc})).booleanValue();
        }
        if (methodDesc == null) {
            LogCatUtil.info("AndroidH2DnsHandler", "preCheck. methodDesc is null,  hell.");
            return false;
        } else if (objArr == null || objArr.length < 1) {
            LogCatUtil.info("AndroidH2DnsHandler", "preCheck. args count < 1 ");
            return false;
        } else {
            Class<?> returnType = method.getReturnType();
            Class<?>[] clsArr = d;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                } else if (returnType == clsArr[i]) {
                    methodDesc.dnsMethodReturnType = returnType;
                    LogCatUtil.warn("AndroidH2DnsHandler", "preCheck. dnsMethodReturnType is ".concat(returnType.getName()));
                    break;
                } else {
                    i++;
                }
            }
            if (methodDesc.dnsMethodReturnType == null) {
                return false;
            }
            String name = method.getName();
            String[] strArr = c;
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    break;
                } else if (strArr[i2].equals(name)) {
                    LogCatUtil.warn("AndroidH2DnsHandler", "preCheck. dnsMethodName is " + name);
                    methodDesc.dnsMethodName = name;
                    break;
                } else {
                    i2++;
                }
            }
            return !TextUtils.isEmpty(methodDesc.dnsMethodName);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129 A[Catch: all -> 0x012a, TRY_ENTER, TryCatch #4 {all -> 0x012a, blocks: (B:67:0x011f, B:71:0x0129, B:76:0x0130, B:77:0x0135), top: B:80:0x003c }] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.Object r24, java.lang.reflect.Method r25, java.lang.Object[] r26) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.http.AndroidH2DnsHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
