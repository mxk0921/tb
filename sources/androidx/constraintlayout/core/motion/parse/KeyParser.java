package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.Arrays;
import tb.uqu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface DataType {
        int get(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Ids {
        int get(String str);
    }

    public static void main(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2272e75f", new Object[]{strArr});
        } else {
            parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
        }
    }

    public static TypedBundle parseAttributes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedBundle) ipChange.ipc$dispatch("e449c789", new Object[]{str});
        }
        return parse(str, new Ids() { // from class: androidx.constraintlayout.core.motion.parse.a
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.Ids
            public final int get(String str2) {
                return uqu.a(str2);
            }
        }, new DataType() { // from class: androidx.constraintlayout.core.motion.parse.b
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.DataType
            public final int get(int i) {
                return uqu.b(i);
            }
        });
    }

    private static TypedBundle parse(String str, Ids ids, DataType dataType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedBundle) ipChange.ipc$dispatch("3538349e", new Object[]{str, ids, dataType});
        }
        TypedBundle typedBundle = new TypedBundle();
        try {
            CLObject parse = CLParser.parse(str);
            int size = parse.size();
            for (int i = 0; i < size; i++) {
                CLKey cLKey = (CLKey) parse.get(i);
                String content = cLKey.content();
                CLElement value = cLKey.getValue();
                int i2 = ids.get(content);
                if (i2 == -1) {
                    PrintStream printStream = System.err;
                    printStream.println("unknown type " + content);
                } else {
                    int i3 = dataType.get(i2);
                    if (i3 == 1) {
                        typedBundle.add(i2, parse.getBoolean(i));
                    } else if (i3 == 2) {
                        typedBundle.add(i2, value.getInt());
                        PrintStream printStream2 = System.out;
                        printStream2.println("parse " + content + " INT_MASK > " + value.getInt());
                    } else if (i3 == 4) {
                        typedBundle.add(i2, value.getFloat());
                        PrintStream printStream3 = System.out;
                        printStream3.println("parse " + content + " FLOAT_MASK > " + value.getFloat());
                    } else if (i3 == 8) {
                        typedBundle.add(i2, value.content());
                        PrintStream printStream4 = System.out;
                        printStream4.println("parse " + content + " STRING_MASK > " + value.content());
                    }
                }
            }
        } catch (CLParsingException e) {
            PrintStream printStream5 = System.err;
            printStream5.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        return typedBundle;
    }
}
