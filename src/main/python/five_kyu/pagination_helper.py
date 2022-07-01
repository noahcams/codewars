import math

class PaginationHelper:

    # The constructor takes in an array of items and an integer indicating
    # how many items fit within a single page
    def __init__(self, collection, items_per_page):
        self.collection = [i for i in collection]
        self.items_per_page = items_per_page

    # returns the number of items within the entire collection
    def item_count(self):
        return len(self.collection)

    # returns the number of pages
    def page_count(self):
        return math.ceil(self.item_count() / self.items_per_page)

    # returns the number of items on the current page. page_index is zero based
    # this method should return -1 for page_index values that are out of range
    def page_item_count(self, page_index):
        # One idea: split the list up into inner lists with lengths <= items_per_page
        # Second idea: if page_index != last page index, return items_per_page,
        #              else return item_count % items_per_page (and then account for edge cases)
        # current_page_items = self.collection
        if page_index not in range(self.page_count()):
            return -1
        elif page_index == self.page_count() - 1:
            return self.item_count() % self.items_per_page
        else:
            return self.items_per_page


    # determines what page an item is on. Zero based indexes.
    # this method should return -1 for item_index values that are out of range
    def page_index(self, item_index):
        # How can I determine what page an item is on?
        # Example: list length: 10, items_per_page: 3, item_index: 7 --> should return 1
        #
        if item_index not in range(self.item_count()):
            return -1
        else:
            return int(item_index / self.items_per_page)


ph = PaginationHelper([1, 3, 5, 7, 9, 11, 13], 2)

items_a_page = ph.items_per_page
fifth_idx_page = ph.page_index(5)

