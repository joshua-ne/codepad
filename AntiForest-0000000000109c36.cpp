#include <bits/stdc++.h>
using namespace std;

#define FO(i,a,b) for (int i = (a); i < (b); i++)
using ll = long long;


int N, M;

class TestCase {
    public:
        vector<int> query(const vector<int> &q) {
            bool isFirst = true;
            for (int c : q) {
                if (!isFirst) cout << ' ';
                isFirst = false;
                cout << c;
            }
            cout << endl;
            vector<int> ret;
            FO(i,0,18) {
                int c;
                cin >> c;
                assert(c != -1);
                ret.push_back(c);
            }
            return ret;
        }
        int getAns(const vector<int> &r, const vector<int> &m) {
            for (int i = 1;; i++) {
                bool gd = true;
                FO(j,0,m.size()) {
                    if (i % m[j] != r[j]) {
                        gd = false;
                        break;
                    }
                }
                if (gd) return i;
            }
        }
        void Solve() {
            vector<int> mods = {18,17,13,11,7,5};
            vector<int> rems;
            for (int m : mods) {
                vector<int> myq;
                FO(i,0,18) myq.push_back(m);
                vector<int> res = query(myq);
                int rem = 0;
                for (int c : res) rem += c;
                rem %= m;
                rems.push_back(rem);
            }
            cout << getAns(rems, mods);
            cout << endl;

            int isRight;
            cin >> isRight;
            assert(isRight == 1);
        }
};


int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int T;
    cin >> T >> N >> M;
    FO(i,1,T+1) {
        //cout << "Case #" << i << ": ";
        TestCase* tc = new TestCase();
        tc->Solve();
        delete tc;
    }
    return 0;
}

