/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


int maxDepth(struct TreeNode* root)
{
    if (!root)
			return 0;
        int nLeftDeep = 1;
        int nRightDeep = 1;
        if (root->left)
            nLeftDeep = nLeftDeep + maxDepth(root->left);
        if (root->right)
            nRightDeep = nRightDeep + maxDepth(root->right);
        if (nLeftDeep > nRightDeep)
            return nLeftDeep;
        else
            return nRightDeep;
    }
