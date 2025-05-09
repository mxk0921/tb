package tb;

import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.AbsEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.PasterChildNode;
import com.taobao.android.litecreator.sdk.editor.data.VideoEditInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h5i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeEditor f20421a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Project c;
        public final /* synthetic */ mkd d;

        public a(MeEditor meEditor, String str, Project project, mkd mkdVar) {
            this.f20421a = meEditor;
            this.b = str;
            this.c = project;
            this.d = mkdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MeEditor meEditor = this.f20421a;
            String g = h5i.g(meEditor, this.b);
            h5i.l(meEditor, g);
            ArrayList arrayList = new ArrayList();
            List<Pair<String, RectF>> b = h5i.b(this.c, meEditor);
            new PasterChildNode();
            for (Pair<String, RectF> pair : b) {
                String str = (String) pair.first;
                RectF rectF = (RectF) pair.second;
                String text = meEditor.getText(str);
                PasterChildNode pasterChildNode = new PasterChildNode();
                pasterChildNode.clipId = str;
                pasterChildNode.renderRectFValues = new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom};
                pasterChildNode.content = text;
                pasterChildNode.defContent = text;
                pasterChildNode.projectId = g;
                arrayList.add(pasterChildNode);
            }
            h5i.k(meEditor);
            this.d.a(arrayList);
        }
    }

    static {
        t2o.a(511705564);
    }

    public static List<String> a(Project project, MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21d96879", new Object[]{project, meEditor, str});
        }
        if (project == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        meEditor.getTrackIdList(str, arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.clear();
            meEditor.getClipIdList((String) it.next(), arrayList3);
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public static List<Pair<String, RectF>> b(Project project, MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d2c527e2", new Object[]{project, meEditor});
        }
        List<String> a2 = a(project, meEditor, "text");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a2) {
            float h = h(meEditor, str);
            float i = i(meEditor, str);
            float positionX = meEditor.getPositionX(str);
            float positionY = meEditor.getPositionY(str);
            float contentWidth = meEditor.getContentWidth(str);
            float contentHeight = meEditor.getContentHeight(str);
            float f = positionX - (h * contentWidth);
            float f2 = positionY - (i * contentHeight);
            arrayList.add(new Pair(str, new RectF(f, f2, contentWidth + f, contentHeight + f2)));
        }
        return arrayList;
    }

    public static float c(MeEditor meEditor, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("520e1a59", new Object[]{meEditor, str, str2, str3})).floatValue();
        }
        if (meEditor == null || meEditor.getCoreEditor() == null) {
            return -1.0f;
        }
        return (float) meEditor.getCoreEditor().getProperty(str, str2, str3, (double) vu3.b.GEO_NOT_SUPPORT);
    }

    public static float d(MeEditor meEditor, String str, String str2, String str3, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efb59a67", new Object[]{meEditor, str, str2, str3, new Float(f)})).floatValue();
        }
        if (meEditor == null || meEditor.getCoreEditor() == null) {
            return f;
        }
        return (float) meEditor.getCoreEditor().getProperty(str, str2, str3, f);
    }

    public static float e(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ae189f5", new Object[]{meEditor, str})).floatValue();
        }
        return d(meEditor, str, "canvas", "xAnchor", 0.0f);
    }

    public static float f(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7cea114", new Object[]{meEditor, str})).floatValue();
        }
        return d(meEditor, str, "canvas", "yAnchor", 0.0f);
    }

    public static String g(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65989f7a", new Object[]{meEditor, str});
        }
        if (meEditor == null) {
            return null;
        }
        return meEditor.getCoreEditor().getProperty(str, "clip", "project_id", "");
    }

    public static float h(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a7cb320", new Object[]{meEditor, str})).floatValue();
        }
        return c(meEditor, str, "canvas", "AnchorX");
    }

    public static float i(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8554d7f", new Object[]{meEditor, str})).floatValue();
        }
        return c(meEditor, str, "canvas", "AnchorY");
    }

    public static boolean j(AbsEditInfo absEditInfo) {
        VideoEditInfo videoEditInfo;
        List<Paster> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70624206", new Object[]{absEditInfo})).booleanValue();
        }
        if (!(absEditInfo instanceof VideoEditInfo) || (list = (videoEditInfo = (VideoEditInfo) absEditInfo).pasters) == null || list.size() <= 0) {
            return true;
        }
        for (Paster paster : videoEditInfo.pasters) {
            if (paster.isTextStyle()) {
                return false;
            }
        }
        return true;
    }

    public static void k(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b73bc02", new Object[]{meEditor});
        } else if (meEditor != null) {
            meEditor.selectProject("");
        }
    }

    public static void l(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada9075b", new Object[]{meEditor, str});
        } else if (meEditor != null) {
            meEditor.selectProject(str);
        }
    }

    public static void m(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d3919c9", new Object[]{meEditor, str});
        } else if (meEditor != null && meEditor.getCoreEditor() != null) {
            if (TextUtils.isEmpty(str)) {
                str = eag.u();
            }
            meEditor.getCoreEditor().setDefaultFontFile(str);
        }
    }

    public static void n(String str, Project project, MeEditor meEditor, mkd<List<PasterChildNode>> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ff3e61", new Object[]{str, project, meEditor, mkdVar});
        } else {
            trt.d(new a(meEditor, str, project, mkdVar), 300L);
        }
    }
}
