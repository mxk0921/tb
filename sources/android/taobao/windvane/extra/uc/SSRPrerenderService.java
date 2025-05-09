package android.taobao.windvane.extra.uc;

import android.net.Uri;
import android.os.Handler;
import android.taobao.windvane.extra.uc.prefetch.ResourcePrefetch;
import android.taobao.windvane.extra.uc.prefetch.ResourceRequest;
import android.taobao.windvane.extra.uc.prefetch.UCDefaultUserAgent;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bgq;
import tb.egq;
import tb.lcn;
import tb.mnf;
import tb.nnf;
import tb.t2o;
import tb.vpw;
import tb.zeq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SSRPrerenderService implements nnf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WindVane/NetworkSSRPrerender";
    private final nnf mService;

    static {
        t2o.a(989856072);
    }

    public SSRPrerenderService() {
        if (vpw.commonConfig.g2) {
            this.mService = new DowngradableSSRService();
        } else {
            this.mService = zeq.a();
        }
    }

    public static /* synthetic */ void access$000(SSRPrerenderService sSRPrerenderService, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bdf98a", new Object[]{sSRPrerenderService, str, str2});
        } else {
            sSRPrerenderService.prefetchResourceList(str, str2);
        }
    }

    public static String makeAbsoluteURL(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a70c517b", new Object[]{str, str2});
        }
        if (str2 == null) {
            return null;
        }
        Uri parse = Uri.parse(str2);
        if (!TextUtils.isEmpty(parse.getScheme())) {
            return str2;
        }
        if (str == null) {
            return null;
        }
        Uri parse2 = Uri.parse(str);
        if (!TextUtils.isEmpty(parse.getAuthority())) {
            return parse.buildUpon().scheme(parse2.getScheme()).toString();
        }
        if (str2.startsWith("/")) {
            return parse.buildUpon().scheme(parse2.getScheme()).encodedAuthority(parse2.getEncodedAuthority()).toString();
        }
        String encodedPath = parse2.getEncodedPath();
        if (encodedPath != null) {
            encodedPath = encodedPath.substring(0, encodedPath.lastIndexOf(47) + 1);
        }
        return parse.buildUpon().scheme(parse2.getScheme()).encodedAuthority(parse2.getEncodedAuthority()).encodedPath(encodedPath).appendEncodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).toString();
    }

    private void prefetchResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6ee3f6", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ResourcePrefetch.getInstance().prefetch(new ResourceRequest.Builder().setUrl(str).setMethod("GET").setHeader(HttpConstant.USER_AGENT, UCDefaultUserAgent.VALUE).build());
        }
    }

    @Override // tb.nnf
    public boolean asyncSend(bgq bgqVar, final mnf mnfVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac8307d5", new Object[]{this, bgqVar, mnfVar, handler})).booleanValue();
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return this.mService.asyncSend(bgqVar, new mnf() { // from class: android.taobao.windvane.extra.uc.SSRPrerenderService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mnf
            public void onError(bgq bgqVar2, egq egqVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a95834", new Object[]{this, bgqVar2, egqVar});
                } else {
                    mnfVar.onError(bgqVar2, egqVar);
                }
            }

            @Override // tb.mnf
            public void onFinish(bgq bgqVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4d53f97", new Object[]{this, bgqVar2});
                } else {
                    mnfVar.onFinish(bgqVar2);
                }
            }

            @Override // tb.mnf
            public void onReceiveData(bgq bgqVar2, byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("150b5e1a", new Object[]{this, bgqVar2, bArr});
                } else if (bArr != null) {
                    if (atomicInteger.get() <= 0 || atomicBoolean.get()) {
                        mnfVar.onReceiveData(bgqVar2, bArr);
                        return;
                    }
                    try {
                        byteArrayOutputStream.write(bArr);
                    } catch (IOException unused) {
                        lcn.f(RVLLevel.Error, SSRPrerenderService.TAG, "failed to write bytes");
                    }
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                        Charset charset = StandardCharsets.UTF_8;
                        String byteArrayOutputStream3 = byteArrayOutputStream2.toString(charset.name());
                        if (byteArrayOutputStream3.length() >= atomicInteger.get()) {
                            String substring = byteArrayOutputStream3.substring(0, atomicInteger.get());
                            SSRPrerenderService.access$000(SSRPrerenderService.this, bgqVar2.f16375a, substring);
                            byte[] bytes = substring.getBytes(charset);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (bytes.length < byteArray.length) {
                                mnfVar.onReceiveData(bgqVar2, Arrays.copyOfRange(byteArray, bytes.length, byteArray.length));
                            }
                            atomicBoolean.set(true);
                        }
                    } catch (Exception unused2) {
                        lcn.f(RVLLevel.Error, SSRPrerenderService.TAG, "failed to parse resource list.");
                    }
                }
            }

            @Override // tb.mnf
            public void onResponse(bgq bgqVar2, int i, Map<String, List<String>> map) {
                int parseInt;
                boolean z = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1e09d3a7", new Object[]{this, bgqVar2, new Integer(i), map});
                    return;
                }
                if (map != null) {
                    try {
                        List<String> list = map.get("x-s-prerender-assets-length");
                        if (list != null) {
                            String str = list.get(0);
                            if (!TextUtils.isEmpty(str) && (parseInt = Integer.parseInt(str)) >= 0) {
                                atomicInteger.set(parseInt);
                            }
                        }
                    } catch (Exception unused) {
                        lcn.f(RVLLevel.Error, SSRPrerenderService.TAG, "failed to parse x-s-prerender-assets-length");
                    }
                }
                if (atomicInteger.get() <= 0) {
                    z = false;
                }
                lcn.a(RVLLevel.Info, SSRPrerenderService.TAG).j("response").a("preRenderAssetsLength", Integer.valueOf(atomicInteger.get())).a("isPrerenderRequest", Boolean.valueOf(z)).f();
                mnfVar.onResponse(bgqVar2, i, map);
            }
        }, handler);
    }

    @Override // tb.nnf
    public boolean cancel(bgq bgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("801a6ac3", new Object[]{this, bgqVar})).booleanValue();
        }
        return this.mService.cancel(bgqVar);
    }

    private void prefetchResourceList(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a7b07e", new Object[]{this, str, str2});
        } else if (str2 != null) {
            try {
                String[] split = str2.split(",");
                for (int i = 0; i < split.length && i < vpw.commonConfig.T1; i++) {
                    String str3 = split[i];
                    if (str3 != null) {
                        try {
                            Uri parse = Uri.parse(str3);
                            if (parse != null) {
                                if (TextUtils.isEmpty(parse.getScheme())) {
                                    prefetchResource(makeAbsoluteURL(str, str3));
                                } else {
                                    prefetchResource(str3);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
