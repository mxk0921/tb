package com.taobao.codetrack.sdk.assets;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import tb.bzn;
import tb.lid;
import tb.t71;
import tb.w2l;
import tb.xq2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AssetsDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final List<String> LAUNCH_ASSETS;
    private static final String TAG = "CodeTrack.assets";

    static {
        ArrayList arrayList = new ArrayList();
        LAUNCH_ASSETS = arrayList;
        arrayList.add("dinamicx/native_logic_dependencies/dependencies.json");
        arrayList.add("feature_resource.json");
        arrayList.add("template/homepage/presetTemplateInfos.json");
        arrayList.add("gateway2/newface_gateway2.json");
        arrayList.add("template/informationFlow/presetTemplateInfos.json");
        arrayList.add("template/informationFlow/recommend_m_home_horizontal_uone_gongge/115/main.dx");
        arrayList.add("template/informationFlow/recommend_m_h_v5_slider_icons_tag_bindingx_d3/226/main.dx");
        arrayList.add("dinamic/dx_appstyle.json");
    }

    public static void proxy_close(AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73525db", new Object[]{assetManager});
            return;
        }
        xq2.a(TAG, "close, enter");
        t71.a("proxy_close", "");
        assetManager.close();
    }

    public static String[] proxy_getLocales(AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("4aadc097", new Object[]{assetManager});
        }
        xq2.a(TAG, "getLocales, enter");
        t71.a("proxy_getLocales", "");
        return assetManager.getLocales();
    }

    public static String[] proxy_list(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("31c7a45c", new Object[]{assetManager, str});
        }
        xq2.a(TAG, "list, enter, path=" + str);
        t71.a("proxy_list", str);
        return assetManager.list(str);
    }

    public static InputStream proxy_open(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("ac320ffc", new Object[]{assetManager, str});
        }
        xq2.a(TAG, "open, enter, fileName=" + str);
        t71.a("proxy_open_S", str);
        if (LAUNCH_ASSETS.contains(str)) {
            xq2.a(TAG, "hit LAUNCH_ASSETS skip remoAssets, " + str);
            return assetManager.open(str);
        }
        lid b = bzn.c().b();
        if (!b.b(str).a()) {
            return assetManager.open(str);
        }
        w2l a2 = b.a(str);
        InputStream a3 = a2.a();
        if (a3 != null) {
            xq2.a(TAG, "open, result success, from remote assets, fileName=" + str);
            return a3;
        }
        FileNotFoundException fileNotFoundException = new FileNotFoundException("taobao assets delegate, open remote assets failed, file=" + str);
        xq2.b(TAG, "open, result failure, from remote assets, fileName=" + str + ", error=" + a2, fileNotFoundException);
        throw fileNotFoundException;
    }

    public static AssetFileDescriptor proxy_openFd(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetFileDescriptor) ipChange.ipc$dispatch("37c277b2", new Object[]{assetManager, str});
        }
        xq2.a(TAG, "openFd, enter, fileName=" + str);
        t71.a("proxy_openFd", str);
        return assetManager.openFd(str);
    }

    public static AssetFileDescriptor proxy_openNonAssetFd(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetFileDescriptor) ipChange.ipc$dispatch("535d9035", new Object[]{assetManager, str});
        }
        xq2.a(TAG, "openNonAssetFd, enter, fileName=" + str);
        t71.a("proxy_openNonAssetFd", str);
        return assetManager.openNonAssetFd(str);
    }

    public static XmlResourceParser proxy_openXmlResourceParser(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("b7f49699", new Object[]{assetManager, str});
        }
        xq2.a(TAG, "openXmlResourceParser, enter, fileName=" + str);
        t71.a("proxy_openXmlResourceParser", str);
        return assetManager.openXmlResourceParser(str);
    }

    public static AssetFileDescriptor proxy_openNonAssetFd(AssetManager assetManager, int i, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetFileDescriptor) ipChange.ipc$dispatch("4cd6b8d8", new Object[]{assetManager, new Integer(i), str});
        }
        xq2.a(TAG, "openNonAssetFd, enter, cookie=" + i + ", fileName=" + str);
        t71.a("proxy_openNonAssetFd_IS", str);
        return assetManager.openNonAssetFd(i, str);
    }

    public static XmlResourceParser proxy_openXmlResourceParser(AssetManager assetManager, int i, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("5b470842", new Object[]{assetManager, new Integer(i), str});
        }
        xq2.a(TAG, "openXmlResourceParser, enter, cookie=" + i + ", fileName=" + str);
        t71.a("proxy_openXmlResourceParser_IS", str);
        return assetManager.openXmlResourceParser(i, str);
    }

    public static InputStream proxy_open(AssetManager assetManager, String str, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("8fb6d8ad", new Object[]{assetManager, str, new Integer(i)});
        }
        xq2.a(TAG, "open, enter, fileName=" + str + ", accessMode=" + i);
        t71.a("proxy_open_SI", str);
        return assetManager.open(str, i);
    }
}
