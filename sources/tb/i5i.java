package tb;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.TextUtils;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.Transform;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i5i implements o4s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MAIN_PROJECT_ID = "";
    public static final int MARVEL_LOG_LEVEL_WARNING = 3;
    public static final String TAG = "UmiPublishTask_Marvel";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final i5i f21104a = new i5i();

        static {
            t2o.a(511705634);
        }

        public static /* synthetic */ i5i a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i5i) ipChange.ipc$dispatch("aab781a3", new Object[0]);
            }
            return f21104a;
        }
    }

    static {
        t2o.a(511705632);
        t2o.a(200278132);
    }

    public static void a(MeEditor meEditor, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9600ba92", new Object[]{meEditor, str, new Long(j)});
            return;
        }
        meEditor.selectProject("");
        meEditor.selectProject(str);
        for (String str2 : e(meEditor, str)) {
            meEditor.setSourceEndTimeUs(str2, j);
        }
        meEditor.selectProject("");
    }

    public static void b(MeEditor meEditor, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a452f08", new Object[]{meEditor, str, new Long(j)});
        } else if (TextUtils.equals(meEditor.getClipType(str), "subProject")) {
            String property = meEditor.getCoreEditor().getProperty(str, "clip", "project_id", "");
            if (!TextUtils.isEmpty(property)) {
                a(meEditor, property, j);
            }
        }
    }

    public static void c(MeEditor meEditor, String str, String str2, Map<String, String> map, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebb6ccf", new Object[]{meEditor, str, str2, map, str3, new Long(j)});
        } else {
            d(meEditor, str, str2, map, str3, 0L, j);
        }
    }

    public static void d(MeEditor meEditor, String str, String str2, Map<String, String> map, String str3, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b2a3d5", new Object[]{meEditor, str, str2, map, str3, new Long(j), new Long(j2)});
        } else if (TextUtils.isEmpty(str2) || map == null) {
            meEditor.changeClipRes(str, str3, j, j2);
        } else {
            meEditor.setSourceStartTimeUs(str, j);
            meEditor.setSourceEndTimeUs(str, j2);
            meEditor.changeClipRes(str, str3, map);
        }
    }

    public static List<String> e(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1ac342d7", new Object[]{meEditor, str});
        }
        return f(meEditor, str, Arrays.asList("main"));
    }

    public static List<String> f(MeEditor meEditor, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2c69f5c6", new Object[]{meEditor, str, list});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        meEditor.selectProject(str);
        meEditor.getTrackIdList("", arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ArrayList arrayList3 = new ArrayList();
            meEditor.getClipIdList((String) it.next(), arrayList3);
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (list == null || !list.contains(meEditor.getClipType(str2))) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static i5i g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i5i) ipChange.ipc$dispatch("95319409", new Object[0]);
        }
        return b.a();
    }

    public static boolean j(Paster paster, u6w u6wVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f3e6073", new Object[]{paster, u6wVar})).booleanValue();
        }
        if (paster == null || (obj = paster.extra) == null || u6wVar == null) {
            return false;
        }
        String str = (String) obj;
        int m1 = u6wVar.m1();
        int j1 = u6wVar.j1();
        int displayWidth = u6wVar.y().getDisplayWidth();
        int displayHeight = u6wVar.y().getDisplayHeight();
        float f = m1;
        float f2 = j1;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        RectF rectF2 = new RectF(0.0f, 0.0f, displayWidth, displayHeight);
        float o1 = (int) (u6wVar.o1(str) * u6wVar.m1());
        float n1 = (int) (u6wVar.n1(str) * u6wVar.j1());
        RectF rectF3 = new RectF(0.0f, 0.0f, o1, n1);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        matrix.mapRect(rectF2);
        Matrix matrix2 = new Matrix();
        float f3 = o1 / 2.0f;
        float f4 = n1 / 2.0f;
        matrix2.postRotate(-paster.transform.rotate, f3, f4);
        Transform transform = paster.transform;
        matrix2.postTranslate(((transform.postionX + 0.5f) * f) - f3, ((transform.postionY + 0.5f) * f2) - f4);
        matrix2.mapRect(rectF3);
        if (rectF3.isEmpty() || (rectF3.top >= rectF2.top && rectF3.bottom <= rectF2.bottom)) {
            return false;
        }
        return true;
    }

    public static void k(MeEditor meEditor, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649b2320", new Object[]{meEditor, str, new Boolean(z)});
        } else if (TextUtils.equals(meEditor.getClipType(str), "subProject")) {
            String property = meEditor.getCoreEditor().getProperty(str, "clip", "project_id", "");
            if (!TextUtils.isEmpty(property)) {
                meEditor.selectProject("");
                meEditor.selectProject(property);
                for (String str2 : e(meEditor, property)) {
                    meEditor.setClipVolume(str2, z ? 0.0f : 1.0f);
                }
                meEditor.selectProject("");
            }
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6259205", new Object[]{this})).intValue();
        }
        int initSDK = Marvel.initSDK(Globals.getApplication());
        odg.c(odg.MODULE_NAME, "UmiPublishTask_Marvel, initMarvelSDK, resultCode=" + initSDK);
        Marvel.setTlogCallback(this);
        return initSDK;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b43e7dd5", new Object[]{this})).booleanValue();
        }
        if (Marvel.isInit() || h() == 0) {
            return true;
        }
        return false;
    }

    public void l(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58cc8d3", new Object[]{this, new Integer(i), str, str2});
        } else if (i >= eag.v()) {
            odg.c(odg.MODULE_NAME, "UmiPublishTask_Marvel, marvel tlog level: " + i + " ,module: " + str + " ,message: " + str2);
        } else {
            odg.d(odg.MODULE_NAME, "UmiPublishTask_Marvel, marvel log level: " + i + " ,module: " + str + " ,message: " + str2);
        }
    }

    public i5i() {
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed5ac79", new Object[]{this});
            return;
        }
        Marvel.unInitSDK();
        odg.c(odg.MODULE_NAME, "unInitMarvelSdk: marvel ");
    }
}
